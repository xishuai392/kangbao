/**
 * 
 */
package cn.kangbao.webapp.web.service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kangbao.common.log.LoggerManager;
import cn.kangbao.webapp.db.appmgr.arg.PatientHealthArg;
import cn.kangbao.webapp.db.appmgr.arg.PatientHealthArg.PatientHealthCriteria;
import cn.kangbao.webapp.db.appmgr.arg.PatientLivestateArg;
import cn.kangbao.webapp.db.appmgr.arg.PatientLivestateArg.PatientLivestateCriteria;
import cn.kangbao.webapp.db.appmgr.arg.PersonArg;
import cn.kangbao.webapp.db.appmgr.arg.PersonArg.PersonCriteria;
import cn.kangbao.webapp.db.appmgr.custom.dao.CustomAllDAO;
import cn.kangbao.webapp.db.appmgr.dao.AppmgrPatientHealthDao;
import cn.kangbao.webapp.db.appmgr.dao.AppmgrPatientLivestateDao;
import cn.kangbao.webapp.db.appmgr.dao.AppmgrPersonDao;
import cn.kangbao.webapp.db.appmgr.entity.PatientHealth;
import cn.kangbao.webapp.db.appmgr.entity.PatientLivestate;
import cn.kangbao.webapp.db.appmgr.entity.Person;
import cn.kangbao.webapp.web.controller.IWebConstans;
import cn.kangbao.webapp.web.vo.PersonVO;

/**
 * <Description> <br>
 * 
 * @author pan.xiaobo<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2014年7月29日 <br>
 * @since V1.0<br>
 * @see cn.kangbao.webapp.web.service <br>
 */
@Service
public class PersonService {
    LoggerManager logger = LoggerManager.getLogger(PersonService.class);

    @Autowired
    private CustomAllDAO customAllDAO;

    @Autowired
    private AppmgrPersonDao appmgrPersonDao;

    @Autowired
    private AppmgrPatientHealthDao appmgrPatientHealthDao;

    @Autowired
    private AppmgrPatientLivestateDao appmgrPatientLivestateDao;

    public List<Person> getPersonByUserId(int userId) {
        PersonArg arg = new PersonArg();
        PersonCriteria cri = arg.createCriteria();
        cri.andUseridEqualTo(userId);
        // 有效的记录
        cri.andDrEqualTo(IWebConstans.FIELD_DR_ACTVED);
        return appmgrPersonDao.selectByArg(arg);
    }

    public int insert(Person record) {
        return appmgrPersonDao.insert(record);
    }

    public Person selectByPersonId(Integer personId) {
        return appmgrPersonDao.selectByPrimaryKey(personId);
    }

    public int updateByPerson(Person record) {
        return appmgrPersonDao.updateByPrimaryKeySelective(record);
    }

    /**
     * 根据personid，获取已配置的patient_livestate，填充到PersonVO中
     * 
     * @param PersonVO
     * @param personid
     */
    public void selectPatientLivestateToPersonVOByPersonId(PersonVO personVO,
            Integer personid) {
        List<Map<String, Object>> resultList = customAllDAO
                .selectPatientLivestateAndSysDict(personid);
        if (null == resultList || resultList.size() == 0)
            return;
        for (Map<String, Object> tmpMap : resultList) {
            String key = (String) tmpMap.get("constant");
            Integer value = (Integer) tmpMap.get("liveItem");
            try {
                BeanUtils.setProperty(personVO, key, value);
            }
            catch (IllegalAccessException | InvocationTargetException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    /**
     * 插入person,Patient_Health,Patient_Livestate表的记录
     * 
     * @param person
     * @param patientHealth
     * @param patientLivestateList
     * @return
     */
    public boolean insertPersonAndHealthAndLiveState(Person person,
            PatientHealth patientHealth,
            List<PatientLivestate> patientLivestateList) {
        int i = insert(person);
        int j = appmgrPatientHealthDao.insert(patientHealth);
        PatientLivestateArg patientLivestateArg = new PatientLivestateArg();
        PatientLivestateCriteria patientLivestateCriteria = patientLivestateArg
                .createCriteria();
        patientLivestateCriteria.andPersonidEqualTo(person.getPersonid());
        int k = appmgrPatientLivestateDao.deleteByArg(patientLivestateArg);
        boolean isNeedInsertLivestate = patientLivestateList.size() > 0 ? true
                : false;
        int l = 0;
        if (isNeedInsertLivestate)
            l = appmgrPatientLivestateDao.insertBatch(patientLivestateList);

        logger.info("person insert: " + i + " ,health insert:" + j
                + " ,livestate delete:" + k + " ,isNeedInsertLivestate :"
                + isNeedInsertLivestate + " ,livestate add:" + l);
        return true;
    }

    /**
     * 更新person,Patient_Health,Patient_Livestate表的记录
     * 
     * @param person
     * @param patientHealth
     * @param patientLivestateList
     * @return
     */
    public boolean updatePersonAndHealthAndLiveState(Person person,
            PatientHealth patientHealth,
            List<PatientLivestate> patientLivestateList) {
        int i = updateByPerson(person);
        int j = appmgrPatientHealthDao.updateByPrimaryKey(patientHealth);
        PatientLivestateArg patientLivestateArg = new PatientLivestateArg();
        PatientLivestateCriteria patientLivestateCriteria = patientLivestateArg
                .createCriteria();
        patientLivestateCriteria.andPersonidEqualTo(person.getPersonid());
        int k = appmgrPatientLivestateDao.deleteByArg(patientLivestateArg);
        boolean isNeedInsertLivestate = patientLivestateList.size() > 0 ? true
                : false;
        int l = 0;
        if (isNeedInsertLivestate)
            l = appmgrPatientLivestateDao.insertBatch(patientLivestateList);

        logger.info("person update: " + i + " ,health update:" + j
                + " ,livestate delete:" + k + " ,isNeedInsertLivestate :"
                + isNeedInsertLivestate + " ,livestate add:" + l);
        return true;
    }

    /**
     * 删除操作，不是物理删除，是更新dr字段
     * 
     * @param personVO
     * @return
     */
    public boolean deletePersonAndHealthAndLiveState(PersonVO personVO) {

        PersonArg personArg = new PersonArg();
        PersonCriteria personCriteria = personArg.createCriteria();
        personCriteria.andPersonidEqualTo(personVO.getPersonid());
        Person person = new Person();
        person.setPersonid(personVO.getPersonid());
        // 置为无效
        person.setDr(IWebConstans.FIELD_DR_DISABLED);

        int i = appmgrPersonDao.updateByArgSelective(person, personArg);

        PatientHealthArg patientHealthArg = new PatientHealthArg();
        PatientHealthCriteria patientHealthCriteria = patientHealthArg
                .createCriteria();
        patientHealthCriteria.andPersonidEqualTo(personVO.getPersonid());
        PatientHealth patientHealth = new PatientHealth();
        patientHealth.setPersonid(personVO.getPersonid());
        // 置为无效
        patientHealth.setDr(IWebConstans.FIELD_DR_DISABLED);

        int j = appmgrPatientHealthDao.updateByArgSelective(patientHealth,
                patientHealthArg);

        PatientLivestateArg patientLivestateArg = new PatientLivestateArg();
        PatientLivestateCriteria patientLivestateCriteria = patientLivestateArg
                .createCriteria();
        patientLivestateCriteria.andPersonidEqualTo(person.getPersonid());
        PatientLivestate patientLivestate = new PatientLivestate();
        patientLivestate.setPersonid(personVO.getPersonid());
        // 置为无效
        patientLivestate.setDr(IWebConstans.FIELD_DR_DISABLED);
        int k = appmgrPatientLivestateDao.updateByArgSelective(
                patientLivestate, patientLivestateArg);

        logger.info("delete... person update dr=1: " + i
                + " ,health update dr=1:" + j + " ,livestate update dr=1:" + k);
        return true;
    }

}
