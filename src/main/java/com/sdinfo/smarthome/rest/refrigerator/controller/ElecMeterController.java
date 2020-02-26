package com.sdinfo.smarthome.rest.refrigerator.controller;


import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.sdinfo.smarthome.rest.refrigerator.domain.*;
import com.sdinfo.smarthome.rest.refrigerator.service.*;

@RestController
@RequestMapping("/smarthome/elecmeter/*")
public class ElecMeterController {
	
	@Autowired
	ElecMeterService elecMeterService;  
	 
	/* TBL_ELEC_METER 테이블 조회 */
	@RequestMapping(value = "/list", method = {RequestMethod.GET}, produces = "application/json; charset=utf8")
	public List<ElecMeterVo> selectQueryElecMeter() throws Exception {
		
		List<ElecMeterVo> elecMeterVo = null;
		
		try {
			elecMeterVo = elecMeterService.getAllElecMeter();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return elecMeterVo;
	}
}
