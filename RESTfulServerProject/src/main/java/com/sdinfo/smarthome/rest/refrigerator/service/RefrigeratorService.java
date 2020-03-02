package com.sdinfo.smarthome.rest.refrigerator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdinfo.smarthome.rest.refrigerator.domain.RefrigeratorVo;
import com.sdinfo.smarthome.rest.refrigerator.mapper.RefrigeratorMapper;

@Service
public class RefrigeratorService {
	
	@Autowired
	RefrigeratorMapper refrigeratorMapper;
	
	/*TBL_REFRIGERATOR SELECT */
	public List<RefrigeratorVo> getAllRefrigerator() throws Exception {
		
		List<RefrigeratorVo> refrigeratorVo = null;
		
		try {
			refrigeratorVo = refrigeratorMapper.getAllRefrigerator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return refrigeratorVo;
	}
	
	/* TBL_REFRIGERATOR INSERT */  
	public RefrigeratorVo insertDataRefrigerator(RefrigeratorVo refrigeratorVo) throws Exception {
		
		try {
			refrigeratorMapper.insertDataRefrigerator(refrigeratorVo);
			System.out.println(refrigeratorVo.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return refrigeratorVo;
	}

}
