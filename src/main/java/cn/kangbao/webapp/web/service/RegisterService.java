/**
 * 
 */
package cn.kangbao.webapp.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kangbao.common.log.LoggerManager;
import cn.kangbao.webapp.db.appmgr.dao.PersonDao;
import cn.kangbao.webapp.db.appmgr.dao.SysUserDao;
import cn.kangbao.webapp.db.appmgr.entity.Person;
import cn.kangbao.webapp.db.appmgr.entity.SysUser;

/**
 * <Description> <br>
 * 
 * @author pan.xiaobo<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2014年9月22日 <br>
 * @since V1.0<br>
 * @see cn.kangbao.webapp.web.service <br>
 */
@Service
public class RegisterService {
    LoggerManager logger = LoggerManager.getLogger(RegisterService.class);

    @Autowired
    private PersonDao personDao;

    @Autowired
    private SysUserDao sysUserDao;

    public boolean insertUserAndPerson(SysUser sysUser, Person person) {

        int i = sysUserDao.insertSelective(sysUser);
        int j = personDao.insertSelective(person);

        logger.info("sysuser insert: " + i + "条， sysUser=" + sysUser
                + " ,person insert:" + j + "条 ,person=" + person);
        return true;
    }

}
