package com.wangsd.springDemo.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/1/11.
 */
public class HijackBeforeMethod implements MethodBeforeAdvice {
    public void before(Method method, Object[] args, Object target)
            throws Throwable {
        System.out.println("HijackBeforeMethod : Before method hijacked!");
    }
}
