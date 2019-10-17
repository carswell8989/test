package test.com.study.common;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

public class CommonDao extends SqlSessionDaoSupport {

	 @Autowired
	 public SqlSessionTemplate sqlSession;
	 
	 public String nameSpace;
	 
	 public void SetNameSpace(String nameSpace) {
		 this.nameSpace = nameSpace;
	 }
	
	
}
