package com.alibaba.webx.common.factory.log;

import org.slf4j.Logger;

public class LoggerFactory {

	public static Logger getLogger(Class<?> clazz) {
		return org.slf4j.LoggerFactory.getLogger(clazz);
	}
}
