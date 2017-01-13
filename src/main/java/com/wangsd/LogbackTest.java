package com.wangsd;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Administrator on 2017/1/11.
 */
public class LogbackTest {

    private static final Logger logger = LogManager.getLogger(LogbackTest.class.getName());

    public static void main(String[] args) {
        logger.info("logger.info");
        logger.debug("logger.debug");
        logger.error("logger.error");
    }
}
