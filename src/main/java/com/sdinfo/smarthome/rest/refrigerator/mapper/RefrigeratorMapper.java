package com.sdinfo.smarthome.rest.refrigerator.mapper;

import java.util.*;

import com.sdinfo.smarthome.rest.refrigerator.domain.*;;


public interface RefrigeratorMapper {

	public List<RefrigeratorVo> getAllRefrigerator() throws Exception;
	
	public int inputData(RefrigeratorVo param) throws Exception;
	
	public void insertDataRefrigerator(RefrigeratorVo refrigeratorVo) throws Exception;
}
