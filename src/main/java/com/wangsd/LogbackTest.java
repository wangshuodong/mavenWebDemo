package com.wangsd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Administrator on 2017/1/11.
 */
public class LogbackTest {

    private final static Logger logger = LoggerFactory.getLogger(LogbackTest.class);

    public static void main(String[] args) {
        logger.info("logger.info");
        logger.debug("logger.debug");
        logger.error("logger.error");
    }
}
