package com.ycyx28.study.api.dto;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class DtoBase implements Serializable{
	private static final long serialVersionUID = 1L;

	@Override
	public String toString(){
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
}
