package com.sdinfo.smarthome.rest.refrigerator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sdinfo.smarthome.rest.refrigerator.domain.RefrigeratorVo;
import com.sdinfo.smarthome.rest.refrigerator.service.RefrigeratorService;

@Controller
@RequestMapping("/smarthome/refrigerator/*")
public class RefrigeratorController {
	
	@Autowired
	RefrigeratorService refrigeratorService;

	@RequestMapping("/sample")
	public void sample() throws Exception{
		
	}
	
	@RequestMapping("/insert")
	public @ResponseBody void insertData(RefrigeratorVo refrigeratorVo) throws Exception {
		
		String home_code = "A100000000";
		String mdate = "2020-02-27 오후5:21:30";
		
		refrigeratorVo.setHome_code(home_code);
		refrigeratorVo.setMdate(mdate);
		
		
		try {
			refrigeratorService.insertDataRefrigerator(refrigeratorVo);
			System.out.println("insert controller 실행");
		} catch (Exception e) {
			 e.printStackTrace();
		}
		

	}
}
