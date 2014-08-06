/**
 * 
 */
package cn.kangbao.webapp.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kangbao.webapp.db.appmgr.arg.PersonArg;
import cn.kangbao.webapp.db.appmgr.arg.PersonArg.PersonCriteria;
import cn.kangbao.webapp.db.appmgr.dao.AppmgrPersonDao;
import cn.kangbao.webapp.db.appmgr.entity.Person;

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
    @Autowired
    private AppmgrPersonDao appmgrPersonDao;

    public List<Person> getPersonByUserId(int userId) {
        PersonArg arg = new PersonArg();
        PersonCriteria cri = arg.createCriteria();
        cri.andUseridEqualTo(userId);
        return appmgrPersonDao.selectByArg(arg);
    }
}
