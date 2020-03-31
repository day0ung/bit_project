package com.palette;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.palette")
public class PaletteApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaletteApplication.class, args);
	}

}
