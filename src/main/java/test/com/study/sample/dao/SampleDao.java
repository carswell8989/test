package test.com.study.sample.dao;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import test.com.study.common.CommonDao;
import test.com.study.sample.vo.SampleVo;


@Repository(value="sampleDao")
public class SampleDao extends CommonDao {

	public SampleDao() {
		SetNameSpace("sampleDao");
	}
	
	public SampleVo selectSample001() {
		
		return selectOne("selectSample001");
	}
	
}
