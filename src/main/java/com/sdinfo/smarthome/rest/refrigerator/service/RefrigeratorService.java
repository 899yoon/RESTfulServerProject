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
    
    public List<RefrigeratorVo> getAll() throws Exception{
    	List<RefrigeratorVo> selectVo = null;
    	
    	try {
    		selectVo = refrigeratorMapper.TBL_REFRIGERATOR();
    	}catch (Exception e) {
    		e.printStackTrace();
    	}
        return selectVo;
    }
}

