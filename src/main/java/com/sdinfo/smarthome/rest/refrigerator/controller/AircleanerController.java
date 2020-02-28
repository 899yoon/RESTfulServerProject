package com.sdinfo.smarthome.rest.refrigerator.controller;


import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.sdinfo.smarthome.rest.refrigerator.domain.*;
import com.sdinfo.smarthome.rest.refrigerator.service.*;

@RestController
@RequestMapping("/smarthome/aircleaner/*")
public class AircleanerController {
	
	@Autowired
	AircleanerService aircleanerService; 
	 
	/* TBL_AIRCLEANER 테이블 조회 */
	@RequestMapping(value = "/list", method = {RequestMethod.GET}, produces = "application/json; charset=utf8")
	public List<AircleanerVo> selectQueryAircleaner() throws Exception {
		
		List<AircleanerVo> aircleanerVo = null;
		
		try {
			aircleanerVo = aircleanerService.getAllAircleaner();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return aircleanerVo;
	}
}
