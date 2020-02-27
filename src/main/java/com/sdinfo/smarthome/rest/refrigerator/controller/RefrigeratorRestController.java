package com.sdinfo.smarthome.rest.refrigerator.controller;


import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.sdinfo.smarthome.rest.refrigerator.domain.*;
import com.sdinfo.smarthome.rest.refrigerator.service.*;

@RestController
@RequestMapping("/smarthome/refrigerator/*")
public class RefrigeratorRestController {
	
	@Autowired
	RefrigeratorService refrigeratorService; 
	 
	@RequestMapping(value = "/list", method = {RequestMethod.GET}, produces = "application/json; charset=utf8")
	public List<RefrigeratorVo> selectQueryRefrigerator() throws Exception {
		
		List<RefrigeratorVo> refrigeratorVo = null;
		
		try {
			refrigeratorVo = refrigeratorService.getAllRefrigerator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return refrigeratorVo;
	}
}
