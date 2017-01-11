package com.wangsd.springDemo;

/**
 * Created by Administrator on 2017/1/11.
 */
public class HelloWorldService {

    private HelloWorld helloWorld;

    public HelloWorldService() {

    }

    public void setHelloWorld(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

    public HelloWorld getHelloWorld() {
        return this.helloWorld;
    }

}
