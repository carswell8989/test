package test.com.study.sample.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.com.study.common.CommonServiceImpl;
import test.com.study.sample.dao.SampleDao;
import test.com.study.sample.service.SampleService;
import test.com.study.sample.vo.SampleVo;

@Service("sampleService")
public class SampleServiceImpl extends CommonServiceImpl implements SampleService  {

	
	@Autowired
	private SampleDao sampleDao;
	
	@Override
	public SampleVo selectSample001() {
		return sampleDao.selectSample001();
	}

}
