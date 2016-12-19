package com.wangsd.resteasy;

import org.jboss.resteasy.plugins.server.netty.NettyJaxrsServer;
import org.jboss.resteasy.spi.ResteasyDeployment;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/19.
 */
public class TestMain {
    public static void main(String[] args) throws UnknownHostException {
        NettyJaxrsServer netty = new NettyJaxrsServer();
        netty.setPort(9999);
        netty.setDeployment(getResteasyDeployment());
        netty.setIdleTimeout(60);
        netty.setIoWorkerCount(0);
        netty.setExecutorThreadCount(256);
        netty.setRootResourcePath("");
        netty.start();
        System.out.println("启动成功");
    }
    private static final ResteasyDeployment getResteasyDeployment() {
        final ResteasyDeployment resteasyDeployment = new ResteasyDeployment();
        resteasyDeployment.setActualResourceClasses(getActualProviderClasses());
        return resteasyDeployment;
    }

    private static final List<Class> getActualProviderClasses() {
        final List<Class> actualProviderClasses = new ArrayList<Class>();
        actualProviderClasses.add(MessageService.class);
        actualProviderClasses.add(UserService.class);
        return actualProviderClasses;
    }
}
