package com.wangsd.springDemo.aop;

import org.springframework.aop.ThrowsAdvice;

/**
 * Created by Administrator on 2017/1/11.
 */
public class HijackThrowException implements ThrowsAdvice {
    public void afterThrowing(IllegalArgumentException e) throws Throwable {
        System.out.println("HijackThrowException : Throw exception hijacked!");
    }
}
