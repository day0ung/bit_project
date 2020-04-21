package com.palette;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@MapperScan(basePackages = "com.palette")
public class PaletteApplication {

	public static final String APPLICATION_LOCATIONS = "com.palette="
	+ "classpath:application.yml,"
	+ "classpath:aws.yml";

	public static void main(String[] args) {
		new SpringApplicationBuilder(PaletteApplication.class)
		.properties(APPLICATION_LOCATIONS)
		.run(args);
	}

}
