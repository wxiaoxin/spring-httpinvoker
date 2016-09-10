package com.xx.spring.invoker.client;

import com.xx.spring.invoker.server.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wxiao on 2016.9.11.
 *
 * Spring HttpInvoker Client
 *
 */

public class Client {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:invoker-service.xml");
        IUserService userService = (IUserService) context.getBean("userService");
        System.out.println("远程调用的结果是：" + userService.getUser().getName() + "  " + userService.getUser().getPassword());

    }
}
