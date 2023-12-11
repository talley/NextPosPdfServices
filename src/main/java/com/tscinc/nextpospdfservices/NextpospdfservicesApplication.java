package com.tscinc.nextpospdfservices;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class NextpospdfservicesApplication {

	private  final static Log _logger= LogFactory.getFactory().getInstance("NextpospdfservicesApplication");
	public static void main(String[] args) {
		SpringApplication.run(NextpospdfservicesApplication.class, args);
	}

}
