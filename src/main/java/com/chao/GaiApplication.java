package com.chao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.chao.dao")

public class GaiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GaiApplication.class, args);
	}
}

