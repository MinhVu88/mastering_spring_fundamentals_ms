package com.udemy.matt_speake.spring_fundamentals.sec_6;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {
	public void query() {
		System.out.println("\thandle database queries");
	}
}
