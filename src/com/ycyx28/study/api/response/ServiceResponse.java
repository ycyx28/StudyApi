package com.ycyx28.study.api.response;

import java.io.Serializable;

public class ServiceResponse implements Serializable{
	
	private static final long serialVersionUID = 2563923050439424380L;

	private String retCode = "SUCCESS";
	
	private String retMsg = "";

	public String getRetCode() {
		return retCode;
	}

	public void setRetCode(String retCode) {
		this.retCode = retCode;
	}

	public String getRetMsg() {
		return retMsg;
	}

	public void setRetMsg(String retMsg) {
		this.retMsg = retMsg;
	}
	

}
