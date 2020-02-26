	package com.sdinfo.smarthome.rest.refrigerator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sdinfo.smarthome.rest.refrigerator.domain.ElecMeterVo;
import com.sdinfo.smarthome.rest.refrigerator.mapper.ElecMeterMapper;


@Service
public class ElecMeterService {
	
	@Autowired
	ElecMeterMapper elecMeterMapper;
	
	/* TBL_ELEC_METER 조회 */
	public List<ElecMeterVo> getAllElecMeter() throws Exception{
		
		List<ElecMeterVo> elecmeterVo = null;
		
		try {
			elecmeterVo = elecMeterMapper.getAllElecMeter();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return elecmeterVo;
	}
}
