package demo.dao;

import java.util.List;

import demo.entity.Users;

public interface IRoleAndUserDAO {
	//���ݽ�ɫ���ֲ鵽��ӵ�е��û�
	List<Users> queryAllUser(String rolename);
	//���ݽ�ɫid�鵽��ӵ�е��û�
	List<Users> queryAllUserforId(int rid);
	//����idb��Ϊ3���û�
	List<Users> queryAllUserNotforId();
	//��ѯӵ�н�ɫ���û���
	int queryAllUserforCount();
}
