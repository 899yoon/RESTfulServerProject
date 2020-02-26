package com.sdinfo.smarthome.rest.refrigerator.domain;

public class TvVo {
	private String home_code;
	private String mdate;
	private int uuid;
	private int transmit_type;
	private int channel_major;
	private int channel_minor;
	private int volume;
	private int input_source;
	private String program_information;
	private int keycode;
	private int local_ip;
	private int idx;
	private String manufacturer;
	private String product_tv_code;
	private int object_moving_sense;
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
	public int getUuid() {
		return uuid;
	}
	public void setUuid(int uuid) {
		this.uuid = uuid;
	}
	public int getTransmit_type() {
		return transmit_type;
	}
	public void setTransmit_type(int transmit_type) {
		this.transmit_type = transmit_type;
	}
	public int getChannel_major() {
		return channel_major;
	}
	public void setChannel_major(int channel_major) {
		this.channel_major = channel_major;
	}
	public int getChannel_minor() {
		return channel_minor;
	}
	public void setChannel_minor(int channel_minor) {
		this.channel_minor = channel_minor;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getInput_source() {
		return input_source;
	}
	public void setInput_source(int input_source) {
		this.input_source = input_source;
	}
	public String getProgram_information() {
		return program_information;
	}
	public void setProgram_information(String program_information) {
		this.program_information = program_information;
	}
	public int getKeycode() {
		return keycode;
	}
	public void setKeycode(int keycode) {
		this.keycode = keycode;
	}
	public int getLocal_ip() {
		return local_ip;
	}
	public void setLocal_ip(int local_ip) {
		this.local_ip = local_ip;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getProduct_tv_code() {
		return product_tv_code;
	}
	public void setProduct_tv_code(String product_tv_code) {
		this.product_tv_code = product_tv_code;
	}
	public int getObject_moving_sense() {
		return object_moving_sense;
	}
	public void setObject_moving_sense(int object_moving_sense) {
		this.object_moving_sense = object_moving_sense;
	}
	public String getRdate() {
		return rdate;
	}
	public void setRdate(String rdate) {
		this.rdate = rdate;
	}
	
	
	@Override
	public String toString() {
		return "TvVo [home_code=" + home_code + ", mdate=" + mdate + ", uuid=" + uuid + ", transmit_type="
				+ transmit_type + ", channel_major=" + channel_major + ", channel_minor=" + channel_minor + ", volume="
				+ volume + ", input_source=" + input_source + ", program_information=" + program_information
				+ ", keycode=" + keycode + ", local_ip=" + local_ip + ", idx=" + idx + ", manufacturer=" + manufacturer
				+ ", product_tv_code=" + product_tv_code + ", object_moving_sense=" + object_moving_sense + ", rdate="
				+ rdate + "]";
	}
}