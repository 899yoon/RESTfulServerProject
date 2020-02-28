package com.sdinfo.smarthome.rest.refrigerator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdinfo.smarthome.rest.refrigerator.domain.TvVo;
import com.sdinfo.smarthome.rest.refrigerator.domain.WaterMeterVo;
import com.sdinfo.smarthome.rest.refrigerator.mapper.TvMapper;
import com.sdinfo.smarthome.rest.refrigerator.mapper.WaterMeterMapper;

@Service
public class WaterMeterService {
	
	@Autowired
	WaterMeterMapper waterMeterMapper;
	
	/* TBL_WATER_METER 조회 */
	public List<WaterMeterVo> getAllWaterMeter() throws Exception{
		
		List<WaterMeterVo> waterMeterVo = null;
		
		try {
			waterMeterVo = waterMeterMapper.getAllWaterMeter();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return waterMeterVo;
	}
}
