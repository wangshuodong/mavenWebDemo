package com.wangsd.springDemo;

import com.wangsd.common.util.SpringContextUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/1/11.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/beans.xml");
        HelloWorldService service = (HelloWorldService)context.getBean("helloWorldService");
        service.getHelloWorld().sayHello();
        System.out.println(SpringContextUtils.getApplicationContext());

    }
}
