package com.sdinfo.smarthome.rest.refrigerator.domain;

public class WaterMeterVo {

	private String home_code;
	private String mdate;
	private String device_id;
	private String device_type;
	private int measure_value;
	private int use_value;
	private String device_status;
	private String rdate;
	
	
	public String getHome_code() {
		return home_code;
	}
	public void setHome_code(String home_code) {
		this.home_code = home_code;
	}
	public String getMdate() {
		return mdate;
	}
	public void setMdate(String mdate) {
		this.mdate = mdate;
	}
	public String getDevice_id() {
		return device_id;
	}
	public void setDevice_id(String device_id) {
		this.device_id = device_id;
	}
	public String getDevice_type() {
		return device_type;
	}
	public void setDevice_type(String device_type) {
		this.device_type = device_type;
	}
	public int getMeasure_value() {
		return measure_value;
	}
	public void setMeasure_value(int measure_value) {
		this.measure_value = measure_value;
	}
	public int getUse_value() {
		return use_value;
	}
	public void setUse_value(int use_value) {
		this.use_value = use_value;
	}
	public String getDevice_status() {
		return device_status;
	}
	public void setDevice_status(String device_status) {
		this.device_status = device_status;
	}
	public String getRdate() {
		return rdate;
	}
	public void setRdate(String rdate) {
		this.rdate = rdate;
	}
	
	
	@Override
	public String toString() {
		return "WaterMeterVo [home_code=" + home_code + ", mdate=" + mdate + ", device_id=" + device_id
				+ ", device_type=" + device_type + ", measure_value=" + measure_value + ", use_value=" + use_value
				+ ", device_status=" + device_status + ", rdate=" + rdate + "]";
	}
}