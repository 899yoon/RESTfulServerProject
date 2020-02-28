package com.sdinfo.smarthome.rest.refrigerator.mapper;

import java.util.List;

import com.sdinfo.smarthome.rest.refrigerator.domain.ElecMeterVo;


public interface ElecMeterMapper {
	public List<ElecMeterVo> getAllElecMeter() throws Exception; //TBL_ELEC_METER 조회
}
