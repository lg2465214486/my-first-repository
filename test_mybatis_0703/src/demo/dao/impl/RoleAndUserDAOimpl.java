package demo.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import demo.dao.IRoleAndUserDAO;
import demo.entity.Users;
import demo.util.MybatisUtil;

public class RoleAndUserDAOimpl implements IRoleAndUserDAO {

	@Override
	public List<Users> queryAllUser(String rolename) {
		List<Users>list=null;
		try {
			SqlSession session=MybatisUtil.getSqlSession();
			IRoleAndUserDAO dao=session.getMapper(IRoleAndUserDAO.class);
			list=dao.queryAllUser(rolename);
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Users> queryAllUserforId(int rid) {
		List<Users>list=null;
		try {
			SqlSession session=MybatisUtil.getSqlSession();
			IRoleAndUserDAO dao=session.getMapper(IRoleAndUserDAO.class);
			list=dao.queryAllUserforId(rid);
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Users> queryAllUserNotforId() {
		List<Users>list=null;
		try {
			SqlSession session=MybatisUtil.getSqlSession();
			IRoleAndUserDAO dao=session.getMapper(IRoleAndUserDAO.class);
			list=dao.queryAllUserNotforId();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int queryAllUserforCount() {
		int count=0;
		try {
			SqlSession session=MybatisUtil.getSqlSession();
			IRoleAndUserDAO dao=session.getMapper(IRoleAndUserDAO.class);
			count=dao.queryAllUserforCount();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}

}
