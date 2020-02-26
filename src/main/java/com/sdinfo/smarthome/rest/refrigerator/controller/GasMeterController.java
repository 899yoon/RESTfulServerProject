package com.sdinfo.smarthome.rest.refrigerator.controller;


import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.sdinfo.smarthome.rest.refrigerator.domain.*;
import com.sdinfo.smarthome.rest.refrigerator.service.*;

@RestController
@RequestMapping("/smarthome/gasmeter/*")
public class GasMeterController {
	
	@Autowired
	GasMeterService gasmeterservice; 
	 
	/* TBL_GAS_METER 테이블 조회 */
	@RequestMapping(value = "/list", method = {RequestMethod.GET}, produces = "application/json; charset=utf8")
	public List<GasMeterVo> selectQueryGasMeter() throws Exception {
		
		List<GasMeterVo> gasMeterVo = null;
		
		try {
			gasMeterVo = gasmeterservice.getAllGasMeter();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return gasMeterVo;
	}
}
