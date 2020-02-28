package com.sdinfo.smarthome.rest.refrigerator.mapper;

import java.util.List;

import com.sdinfo.smarthome.rest.refrigerator.domain.GasMeterVo;



public interface GasMeterMapper {
	public List<GasMeterVo> getAllGasMeter() throws Exception; //TBL_GAS_METER 조회
}
