	package com.sdinfo.smarthome.rest.refrigerator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdinfo.smarthome.rest.refrigerator.domain.AircleanerVo;
import com.sdinfo.smarthome.rest.refrigerator.domain.GasMeterVo;
import com.sdinfo.smarthome.rest.refrigerator.mapper.AircleanerMapper;
import com.sdinfo.smarthome.rest.refrigerator.mapper.GasMeterMapper;

@Service
public class GasMeterService {
	
	@Autowired
	GasMeterMapper gasMeterMapper;
	
	/* TBL_GAS_METER 조회 */
	public List<GasMeterVo> getAllGasMeter() throws Exception{
		
		List<GasMeterVo> gasMeterVo = null;
		
		try {
			gasMeterVo = gasMeterMapper.getAllGasMeter();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return gasMeterVo;
	}
}
