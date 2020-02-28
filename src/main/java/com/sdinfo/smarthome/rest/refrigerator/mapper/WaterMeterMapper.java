package com.sdinfo.smarthome.rest.refrigerator.mapper;

import java.util.List;

import com.sdinfo.smarthome.rest.refrigerator.domain.WaterMeterVo;



public interface WaterMeterMapper {

	public List<WaterMeterVo> getAllWaterMeter() throws Exception; // TBL_WATER_METER 조회
}
