package com.sdinfo.smarthome.rest.refrigerator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdinfo.smarthome.rest.refrigerator.domain.AircleanerVo;
import com.sdinfo.smarthome.rest.refrigerator.mapper.AircleanerMapper;

@Service
public class AircleanerService {
	
	@Autowired
	AircleanerMapper aircleanerMapper;
	
	/* TBL_AIRCLEANER 조회 */
	public List<AircleanerVo> getAllAircleaner() throws Exception{
		
		List<AircleanerVo> aircleanerVo = null;
		
		try {
			aircleanerVo = aircleanerMapper.getAllAircleaner();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return aircleanerVo;
	}
}
