package demo.test;

import org.apache.ibatis.session.SqlSession;

import demo.dao.IRoleAndUserDAO;
import demo.util.MybatisUtil;

public class Test {

	@org.junit.Test
	public void load() {
		SqlSession session=MybatisUtil.getSqlSession();
		IRoleAndUserDAO dao=session.getMapper(IRoleAndUserDAO.class);
		//��ѯ��ɫΪsuper����Ա����Ա
		System.out.println("��ɫΪsuper����Ա����Ա��"+dao.queryAllUser("super����Ա"));
		
		//��ѯ��ɫidΪ2����Ա
		System.out.println("��ɫidΪ2����Ա��"+dao.queryAllUserforId(2));
		
		//��ѯ��ɫid��ΪΪ3����Ա
		System.out.println("��ɫid��ΪΪ3����Ա��"+dao.queryAllUserNotforId());
		
		//��ѯӵ�н�ɫ���˵�����
		System.out.println("��ѯӵ�н�ɫ���˵�����"+dao.queryAllUserforCount());
	}
}
