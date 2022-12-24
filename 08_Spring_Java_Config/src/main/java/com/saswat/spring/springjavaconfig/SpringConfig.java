package com.saswat.spring.springjavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(DaoConfig.class)
public class SpringConfig {
	@Bean
	public Service servide() {
		return new Service();
	}
}
