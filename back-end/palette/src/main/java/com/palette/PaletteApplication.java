package com.palette;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan(basePackages = "com.palette")
public class PaletteApplication {

	// @Value("${amazonProperties.accessKey}")
    // private String accessKey;
	// @Value("${amazonProperties.secretKey}")
	// 	private String secretKey;
	// @Value("${amazonProperties.region}")
	// 	private String region;

	public static final String APPLICATION_LOCATIONS = "com.palette="
	+ "classpath:application.yml,"
	+ "classpath:aws.yml";

	public static void main(String[] args) {
		new SpringApplicationBuilder(PaletteApplication.class)
		.properties(APPLICATION_LOCATIONS)
		.run(args);
	}

	// @Bean
	// public AmazonS3 amazonS3Client(AWSCredentials awsCredentials) {
	// 	AmazonS3 amazonS3Client = AmazonS3ClientBuilder.standard()
	// 			.withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).withRegion(region).build();
    // return amazonS3Client;
	//}

}
