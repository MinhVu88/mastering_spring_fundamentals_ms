package com.udemy.matt_speake.spring_fundamentals.sec_6.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:application-prod.properties")
@Profile("prod")
@Configuration
@ComponentScan("com.udemy.matt_speake.spring_fundamentals.sec_6")
public class ProdConfig {
}
