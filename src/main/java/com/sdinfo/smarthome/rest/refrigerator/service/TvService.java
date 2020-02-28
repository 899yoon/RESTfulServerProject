package com.sdinfo.smarthome.rest.refrigerator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdinfo.smarthome.rest.refrigerator.domain.TvVo;
import com.sdinfo.smarthome.rest.refrigerator.mapper.TvMapper;

@Service
public class TvService {
	
	@Autowired
	TvMapper tvMapper;
	
	/* TBL_TV 조회 */
	public List<TvVo> getAllTv() throws Exception{
		
		List<TvVo> tvVo = null;
		
		try {
			tvVo = tvMapper.getAllTv();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return tvVo;
	}
}
