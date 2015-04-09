package mybatis;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SessionFactory {

	
	public static SqlSession getDB() throws Exception {
		
		 String resource =  "mybatis/mybatisConfig.xml";
		 
		//ͨ��xml�����ļ���ʽ����SqlSessionFactory
		Reader reader = Resources.getResourceAsReader(resource);
		SqlSessionFactory sqlSessionFactory= new SqlSessionFactoryBuilder().build(reader);
		
		//����SqlSessionʵ��
		SqlSession session = sqlSessionFactory.openSession();
		
		return session;
	}
}
