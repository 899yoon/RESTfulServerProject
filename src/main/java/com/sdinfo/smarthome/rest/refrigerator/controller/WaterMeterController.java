package com.sdinfo.smarthome.rest.refrigerator.controller;


import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.sdinfo.smarthome.rest.refrigerator.domain.*;
import com.sdinfo.smarthome.rest.refrigerator.service.*;

@RestController
@RequestMapping("/smarthome/watermeter/*")
public class WaterMeterController {
	
	@Autowired
	WaterMeterService watermeterservice; 
	 
	/* TBL_WATER_METER 테이블 조회 */
	@RequestMapping(value = "/list", method = {RequestMethod.GET}, produces = "application/json; charset=utf8")
	public List<WaterMeterVo> selectQueryWaterMeter() throws Exception {
		
		List<WaterMeterVo> waterMeterVo = null;
		
		try {
			waterMeterVo = watermeterservice.getAllWaterMeter();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return waterMeterVo;
	}
}