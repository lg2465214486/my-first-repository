package demo.test;

import org.apache.ibatis.session.SqlSession;

import demo.dao.IRoleAndUserDAO;
import demo.util.MybatisUtil;

public class Test {

	@org.junit.Test
	public void load() {
		SqlSession session=MybatisUtil.getSqlSession();
		IRoleAndUserDAO dao=session.getMapper(IRoleAndUserDAO.class);
		//查询角色为super管理员的人员
		System.out.println("角色为super管理员的人员："+dao.queryAllUser("super管理员"));
		
		//查询角色id为2的人员
		System.out.println("角色id为2的人员："+dao.queryAllUserforId(2));
		
		//查询角色id不为为3的人员
		System.out.println("角色id不为为3的人员："+dao.queryAllUserNotforId());
		
		//查询拥有角色的人的数量
		System.out.println("查询拥有角色的人的数量"+dao.queryAllUserforCount());
	}
}
