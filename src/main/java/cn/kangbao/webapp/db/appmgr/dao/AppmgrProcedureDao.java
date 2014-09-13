package cn.kangbao.webapp.db.appmgr.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.kangbao.webapp.db.appmgr.AppmgrSessionAndMapperSupport;

@Repository
public class AppmgrProcedureDao{

	/*
	 * 调用存储过程
	 * 
	 * @procedureID 存储过程对应的sql配置中的ID名
	 * 
	 * @param 存储过程的参数
	 */
	@Autowired
	private AppmgrSessionAndMapperSupport sessionSupport;
	
	public Object selectProcedureParam(String procedureID, Object param) {
		SqlSession session = sessionSupport.getSession();
		session.commit();
		try {
			List returnValue = session.selectList(procedureID, param);
			return param;
		} catch (Exception e) {
			session.rollback();
			throw new RuntimeException(e);
		}
		finally{
			session.close();
		}
	}
	
	public List selectProcedure(String procedureID, Object param) {
		SqlSession session = sessionSupport.getSession();
		session.commit();
		try {
			List returnValue = session.selectList(procedureID, param);
			return returnValue;
		} catch (Exception e) {
			session.rollback();
			throw new RuntimeException(e);
		}
		finally{
			session.close();
		} 
	}
	public List selectProcedure(String procedureID) {
		SqlSession session = sessionSupport.getSession();
		session.commit();
		try {
			List returnValue = session.selectList(procedureID);
			return returnValue;
		} catch (Exception e) {
			session.rollback();
			throw new RuntimeException(e);
		}
		finally{
			session.close();
		}
	}
	public int insertProcedure(String procedureID, Object param) {
		SqlSession session = sessionSupport.getSession();
		session.commit();
		try {
			int returnValue = session.insert(procedureID, param);
			return returnValue;
		} catch (Exception e) {
			session.rollback();
			throw new RuntimeException(e);
		}
		finally{
			session.close();
		}
	}
	public int insertProcedure(String procedureID) {
		SqlSession session = sessionSupport.getSession();
		session.commit();
		try {
			int returnValue = session.insert(procedureID);
			return returnValue;
		} catch (Exception e) {
			session.rollback();
			throw new RuntimeException(e);
		}
		finally{
			session.close();
		}
	}
	public int updateProcedure(String procedureID, Object param) {
		SqlSession session = sessionSupport.getSession();
		session.commit();
		try {
			int returnValue = session.update(procedureID, param);
			return returnValue;
		} catch (Exception e) {
			session.rollback();
			throw new RuntimeException(e);
		}
		finally{
			session.close();
		}
	}
	public int updateProcedure(String procedureID) {
		SqlSession session = sessionSupport.getSession();
		session.commit();
		try {
			int returnValue = session.update(procedureID);
			return returnValue;
		} catch (Exception e) {
			session.rollback();
			throw new RuntimeException(e);
		}
		finally{
			session.close();
		}
	}
	public int deleteProcedure(String procedureID, Object param) {
		SqlSession session = sessionSupport.getSession();
		session.commit();
		try {
			int returnValue = session.delete(procedureID, param);
			return returnValue;
		} catch (Exception e) {
			session.rollback();
			throw new RuntimeException(e);
		}
		finally{
			session.close();
		}
	}
	public int deleteProcedure(String procedureID) {
		SqlSession session = sessionSupport.getSession();
		session.commit();
		try {
			int returnValue = session.delete(procedureID);
			return returnValue;
		} catch (Exception e) {
			session.rollback();
			throw new RuntimeException(e);
		}
		finally{
			session.close();
		}
	}
}
