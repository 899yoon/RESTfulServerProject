package com.sdinfo.smarthome.rest.refrigerator.controller;


import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.sdinfo.smarthome.rest.refrigerator.domain.*;
import com.sdinfo.smarthome.rest.refrigerator.service.*;

@RestController
@RequestMapping("/smarthome/tv/*")
public class TvController {
	
	@Autowired
	TvService tvservice; 
	 
	/* TBL_TV 테이블 조회 */
	@RequestMapping(value = "/list", method = {RequestMethod.GET}, produces = "application/json; charset=utf8")
	public List<TvVo> selectQueryTv() throws Exception {
		
		List<TvVo> tvVo = null;
		
		try {
			tvVo = tvservice.getAllTv();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tvVo;
	}
}