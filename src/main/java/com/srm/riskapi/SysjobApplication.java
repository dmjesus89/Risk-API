package com.srm.riskapi;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import com.srm.riskapi.config.property.ApiProperty;

@SpringBootApplication
@EnableConfigurationProperties({ ApiProperty.class })
public class SysjobApplication {

	public static void main(String[] args) {
		SpringApplication.run(SysjobApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
