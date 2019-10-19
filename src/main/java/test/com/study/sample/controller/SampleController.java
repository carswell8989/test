package test.com.study.sample.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import test.com.study.sample.service.SampleService;
import test.com.study.sample.vo.SampleVo;

@Controller
public class SampleController {

	
	@Autowired
	private SampleService sampleService;
	
	@RequestMapping("/sample")
	public Map<String, Object> selectSample001(){
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		SampleVo resultVo = sampleService.selectSample001();
		
		System.out.println("resultVo :: "+resultVo.getId());
		System.out.println("resultVo :: "+resultVo.getPassword());
		
		resultMap.put("result", resultVo);
		
		//현재는 리턴받을 화면이 없다.
		return resultMap;
	}
	
}
