package demo.dao;

import java.util.List;

import demo.entity.Users;

public interface IRoleAndUserDAO {
	//根据角色名字查到它拥有的用户
	List<Users> queryAllUser(String rolename);
	//根据角色id查到它拥有的用户
	List<Users> queryAllUserforId(int rid);
	//查找idb不为3的用户
	List<Users> queryAllUserNotforId();
	//查询拥有角色的用户数
	int queryAllUserforCount();
}
