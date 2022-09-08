package com.udemy.matt_speake.spring_fundamentals.sec_1_5.data;

// import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public class ReposImplementation2 implements Repos {
  @Override
  public void queryDb() {
    System.out.println("\tHandling db queries 2\n");
  }
}
