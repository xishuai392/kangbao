package cn.kangbao.webapp.db.appmgr;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Repository;

@Configuration
@Repository
public class AppmgrSessionAndMapperSupport extends SqlSessionDaoSupport {

    @Resource(name = "webappsqlSessionFactory")
    private SqlSessionFactory sqlSessionFactory;

    public void getConnectionFactory() {
        setSqlSessionFactory(this.sqlSessionFactory);
        return;
    }

    public SqlSession getSession() {
        return sqlSessionFactory.openSession();
    }

    public <T> T getMapper(Class mapper) {
        return (T) getSqlSession().getMapper(mapper);
    }


}