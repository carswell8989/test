package test.com.study.common;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

public class CommonDao extends SqlSessionDaoSupport {

	 @Autowired(required =false)
	 @Override
	 public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
	  super.setSqlSessionFactory(sqlSessionFactory);
	 }
	 
	 @Autowired(required = false)
	 @Override
	 public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
	  super.setSqlSessionTemplate(sqlSessionTemplate);
	 }

	 
	 public String nameSpace;
	 
	 public void SetNameSpace(String nameSpace) {
		 this.nameSpace = nameSpace;
	 }
	 
	 //파라미터가 없는 타입의 selectOne
	 public <T> T selectOne(String queryId) {
		 
		 return getSqlSession().selectOne(nameSpace+"."+queryId);
		 
	 }
	 
	 
	 //파라미터가 있는 타입의 selectOne
	 public <T, P> T selectOne(P p, String queryId) {
		 
		 return getSqlSession().selectOne(nameSpace+"."+queryId, p);
		 
	 }
	 
	
	
}
