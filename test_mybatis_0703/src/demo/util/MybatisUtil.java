package demo.util;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

//封装SqlSession操作工具类
public class MybatisUtil {
	static SqlSessionFactory sessionFactory = null;
	static{
		try {
			InputStream is = 
					Resources.getResourceAsStream("mybatis-config.xml");
					//实例化工厂Builder
					SqlSessionFactoryBuilder builder = 
							new SqlSessionFactoryBuilder();
					sessionFactory = builder.build(is);//加载MyBatis配置到工厂
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static SqlSession getSqlSession() {
		System.out.println("获取SqlSession");
		return sessionFactory.openSession();
	}
	
	public static void closeSqlSession(SqlSession session) {
		System.out.println("关闭SqlSession");
		 if (session != null) {
			session.close();
		}
	}
}
