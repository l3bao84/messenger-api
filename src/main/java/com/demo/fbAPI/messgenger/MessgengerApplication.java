package com.demo.fbAPI.messgenger;

import com.github.messenger4j.Messenger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MessgengerApplication {

	@Bean
	public Messenger messenger(@Value("${messenger4j.pageAccessToken}") String pageAccessToken,
							   @Value("${messenger4j.appSecret}") final String appSecret,
							   @Value("${messenger4j.verifyToken}") final String verifyToken) {
		return Messenger.create(pageAccessToken, appSecret, verifyToken);
	}

	public static void main(String[] args) {
		SpringApplication.run(MessgengerApplication.class, args);
	}

}
