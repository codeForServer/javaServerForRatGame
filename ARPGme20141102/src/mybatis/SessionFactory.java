package mybatis;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SessionFactory {

	
	public static SqlSession getDB() throws Exception {
		
		 String resource =  "mybatis/mybatisConfig.xml";
		 
		//通过xml配置文件方式生成SqlSessionFactory
		Reader reader = Resources.getResourceAsReader(resource);
		SqlSessionFactory sqlSessionFactory= new SqlSessionFactoryBuilder().build(reader);
		
		//生成SqlSession实例
		SqlSession session = sqlSessionFactory.openSession();
		
		return session;
	}
}
