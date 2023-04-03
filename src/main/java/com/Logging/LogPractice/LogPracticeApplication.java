package com.Logging.LogPractice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogPracticeApplication {

	private static Logger log=LoggerFactory.getLogger(LogPracticeApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(LogPracticeApplication.class, args);
		log.info("info started");
		log.warn("warn");
		log.error("error");

		//////log.debug("debug");


	}

}
