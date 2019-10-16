package test.com.study.common;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class CommonDao {

	@Autowired
	protected SqlSessionTemplate sqlSession;
	 

	
}
