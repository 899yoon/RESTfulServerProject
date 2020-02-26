package com.sdinfo.smarthome.rest.refrigerator.controller;


import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.sdinfo.smarthome.rest.refrigerator.domain.*;
import com.sdinfo.smarthome.rest.refrigerator.service.*;

@RestController
@RequestMapping("/smarthome/refrigerator/*")
public class RefrigeratorController {
	
	@Autowired
	RefrigeratorService refrigeratorService; 
	 
	@RequestMapping(value = "/list", method = {RequestMethod.GET}, produces = "application/json; charset=utf8")
	public List<RefrigeratorVo> selectQuery() throws Exception {
		
		List<RefrigeratorVo> refrigeratorVo = null;
		
		try {
			refrigeratorVo = refrigeratorService.getAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return refrigeratorVo;
	}
}
