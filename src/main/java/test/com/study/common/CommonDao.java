package test.com.study.common;

import java.util.List;

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
	 
	 //파라미터가 없는 selectOne
	 public <T> T selectOne(String queryId) {
		 
		 return getSqlSession().selectOne(nameSpace+"."+queryId);
		 
	 }
	 
	 
	 //파라미터가 있는 selectOne
	 public <T, P> T selectOne(String queryId, P p) {
		 
		 return getSqlSession().selectOne(nameSpace+"."+queryId, p);
		 
	 }
	 
	 //파라미터가 없는 selectList
	 public <T> List<T> selectList(String queryId) {
		 
		 return getSqlSession().selectList(nameSpace+"."+queryId);
	 }
	 
	 //파라미터가 있는 selectList
	 public <T, P> List<T> selectList(String queryId, P p) {
		 
		 return getSqlSession().selectList(nameSpace+"."+queryId, p);
	 }
	 
	 //파라미터가 없는 update
	 public int update(String queryId) {
		 
		 return getSqlSession().update(nameSpace+"."+queryId);
	 }
	 
	 
	 //파라미터가 있는 update
	 public <P>int update(String queryId, P p) {
		 
		 return getSqlSession().update(nameSpace+"."+queryId, p);
	 }
	 
	 //파라미터가 없는 delete
	 public int delete(String queryId) {
		 
		 return getSqlSession().delete(nameSpace+"."+queryId);
	 }
	 
	 
	 //파라미터가 있는 delete
	 public <P>int delete(String queryId, P p) {
		 
		 return getSqlSession().delete(nameSpace+"."+queryId, p);
	 }
	
	
}
