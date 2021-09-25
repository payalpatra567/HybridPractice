package com.mindtree.utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log {
	

	public static Logger logger(String classname) {
		org.apache.logging.log4j.Logger log = LogManager.getLogger(classname);
		return log;
	}
	

}
