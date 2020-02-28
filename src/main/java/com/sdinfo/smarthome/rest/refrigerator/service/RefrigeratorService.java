package com.sdinfo.smarthome.rest.refrigerator.service;


import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import com.sdinfo.smarthome.rest.refrigerator.domain.*;
import com.sdinfo.smarthome.rest.refrigerator.mapper.*;
 
@Service
public class RefrigeratorService {
 
    @Autowired
    RefrigeratorMapper refrigeratorMapper;
    
    public List<RefrigeratorVo> getAllRefrigerator() throws Exception{
    	List<RefrigeratorVo> selectVo = null;
    	
    	try {
    		selectVo = refrigeratorMapper.getAllRefrigerator();
    	}catch (Exception e) {
    		e.printStackTrace();
    	}
        return selectVo;
    }
    
    public void insertDataRefrigerator(RefrigeratorVo refrigeratorVo) throws Exception {
		
		try {
			refrigeratorMapper.insertDataRefrigerator(refrigeratorVo);
			System.out.println("insert service 실행");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

