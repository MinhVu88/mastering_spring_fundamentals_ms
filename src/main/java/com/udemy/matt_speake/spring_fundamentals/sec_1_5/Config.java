package com.udemy.matt_speake.spring_fundamentals.sec_1_5;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
// import org.springframework.context.annotation.Scope;
// import org.springframework.context.annotation.Bean;

@Configuration
@ComponentScan(basePackages = "udemy.matt_speake.sec_1_5")
public class Config {
  // @Bean
  // @Scope(value = "prototype")
  // public Services getServices() {
  //   return new Services(getRepos());
  // }

  // @Bean
  // public Repos getRepos() {
  //   return new Repos();
  // }
}
