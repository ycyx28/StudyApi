package com.ycyx28.study.api;

import com.ycyx28.study.api.dto.Hello;
import com.ycyx28.study.api.response.ServiceResponse;

public interface IHelloWorld {

	
	public ServiceResponse sayHello(Hello hello) ;
	
}
