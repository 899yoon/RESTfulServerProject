package com.sdinfo.smarthome.rest.refrigerator.domain;

public class AircleanerVo {
	private String home_code;
	private String mdate;
	private int uc_producttype;
	private int uc_modelgroup;
	private int uc_power;
	private int uc_fanmode;
	private int uc_totalaircleanless;
	private int uc_duststatus;
	private int ui_dustpm2_5data;
	private int uc_gasstatus;
	private int uc_filteralarm;
	private int uc_humanbodysensor;
	private int ui_humanbodysensordata;
	private int sc_tempsensor;
	private int uc_humiditysensor;
	private int uc_bpm_movingpower;
	private int ui_bpm_data;
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
	public int getUc_producttype() {
		return uc_producttype;
	}
	public void setUc_producttype(int uc_producttype) {
		this.uc_producttype = uc_producttype;
	}
	public int getUc_modelgroup() {
		return uc_modelgroup;
	}
	public void setUc_modelgroup(int uc_modelgroup) {
		this.uc_modelgroup = uc_modelgroup;
	}
	public int getUc_power() {
		return uc_power;
	}
	public void setUc_power(int uc_power) {
		this.uc_power = uc_power;
	}
	public int getUc_fanmode() {
		return uc_fanmode;
	}
	public void setUc_fanmode(int uc_fanmode) {
		this.uc_fanmode = uc_fanmode;
	}
	public int getUc_totalaircleanless() {
		return uc_totalaircleanless;
	}
	public void setUc_totalaircleanless(int uc_totalaircleanless) {
		this.uc_totalaircleanless = uc_totalaircleanless;
	}
	public int getUc_duststatus() {
		return uc_duststatus;
	}
	public void setUc_duststatus(int uc_duststatus) {
		this.uc_duststatus = uc_duststatus;
	}
	public int getUi_dustpm2_5data() {
		return ui_dustpm2_5data;
	}
	public void setUi_dustpm2_5data(int ui_dustpm2_5data) {
		this.ui_dustpm2_5data = ui_dustpm2_5data;
	}
	public int getUc_gasstatus() {
		return uc_gasstatus;
	}
	public void setUc_gasstatus(int uc_gasstatus) {
		this.uc_gasstatus = uc_gasstatus;
	}
	public int getUc_filteralarm() {
		return uc_filteralarm;
	}
	public void setUc_filteralarm(int uc_filteralarm) {
		this.uc_filteralarm = uc_filteralarm;
	}
	public int getUc_humanbodysensor() {
		return uc_humanbodysensor;
	}
	public void setUc_humanbodysensor(int uc_humanbodysensor) {
		this.uc_humanbodysensor = uc_humanbodysensor;
	}
	public int getUi_humanbodysensordata() {
		return ui_humanbodysensordata;
	}
	public void setUi_humanbodysensordata(int ui_humanbodysensordata) {
		this.ui_humanbodysensordata = ui_humanbodysensordata;
	}
	public int getSc_tempsensor() {
		return sc_tempsensor;
	}
	public void setSc_tempsensor(int sc_tempsensor) {
		this.sc_tempsensor = sc_tempsensor;
	}
	public int getUc_humiditysensor() {
		return uc_humiditysensor;
	}
	public void setUc_humiditysensor(int uc_humiditysensor) {
		this.uc_humiditysensor = uc_humiditysensor;
	}
	public int getUc_bpm_movingpower() {
		return uc_bpm_movingpower;
	}
	public void setUc_bpm_movingpower(int uc_bpm_movingpower) {
		this.uc_bpm_movingpower = uc_bpm_movingpower;
	}
	public int getUi_bpm_data() {
		return ui_bpm_data;
	}
	public void setUi_bpm_data(int ui_bpm_data) {
		this.ui_bpm_data = ui_bpm_data;
	}
	public String getRdate() {
		return rdate;
	}
	public void setRdate(String rdate) {
		this.rdate = rdate;
	}
	
	
	@Override
	public String toString() {
		return "AircleanerVo [home_code=" + home_code + ", mdate=" + mdate + ", uc_producttype=" + uc_producttype
				+ ", uc_modelgroup=" + uc_modelgroup + ", uc_power=" + uc_power + ", uc_fanmode=" + uc_fanmode
				+ ", uc_totalaircleanless=" + uc_totalaircleanless + ", uc_duststatus=" + uc_duststatus
				+ ", ui_dustpm2_5data=" + ui_dustpm2_5data + ", uc_gasstatus=" + uc_gasstatus + ", uc_filteralarm="
				+ uc_filteralarm + ", uc_humanbodysensor=" + uc_humanbodysensor + ", ui_humanbodysensordata="
				+ ui_humanbodysensordata + ", sc_tempsensor=" + sc_tempsensor + ", uc_humiditysensor="
				+ uc_humiditysensor + ", uc_bpm_movingpower=" + uc_bpm_movingpower + ", ui_bpm_data=" + ui_bpm_data
				+ ", rdate=" + rdate + "]";
	}
}