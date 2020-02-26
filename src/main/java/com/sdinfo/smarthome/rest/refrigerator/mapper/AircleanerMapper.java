package com.sdinfo.smarthome.rest.refrigerator.mapper;

import java.util.List;

import com.sdinfo.smarthome.rest.refrigerator.domain.AircleanerVo;

public interface AircleanerMapper {
	public List<AircleanerVo> getAllAircleaner() throws Exception; //TBL_AIRCLEANER 조회
}
