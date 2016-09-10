package com.xx.spring.invoker.server.service;


import com.xx.spring.invoker.server.model.User;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;

public interface IUserService {
	
	public User getUser();

}
