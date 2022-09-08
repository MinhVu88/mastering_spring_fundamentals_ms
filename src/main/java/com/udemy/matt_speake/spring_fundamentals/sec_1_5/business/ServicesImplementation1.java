package com.udemy.matt_speake.spring_fundamentals.sec_1_5.business;

import com.udemy.matt_speake.spring_fundamentals.sec_1_5.data.Repos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
// import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class ServicesImplementation1 implements Services {
    // @Autowired
    private Repos repos;

    // constructor-based dependency injection (recommended)
    @Autowired
    public ServicesImplementation1(@Qualifier("reposImplementation1") Repos repos) {
      this.repos = repos;
    }

    // setter-based dependency injection
    // public void setRepos(Repos repos) {
    //   this.repos = repos;
    // }

    @Override
    public void doBusinessLogic() {
      System.out.println("\tHandling business logic 1");
      repos.queryDb();
    }
}
