package com.udemy.matt_speake.spring_fundamentals.sec_1_5.business;

import org.springframework.stereotype.Service;

@Service
public class ServicesImplementation2 implements Services {
    @Override
    public void doBusinessLogic() {
      System.out.println("\tHandling business logic 2");
    }
}
