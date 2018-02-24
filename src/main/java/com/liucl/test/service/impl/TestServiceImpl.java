package com.liucl.test.service.impl;



import org.springframework.stereotype.Service;

import com.liucl.test.service.TestService;

@Service("testServiceImpl")
public class TestServiceImpl implements TestService{
	
	public void doSomething(){
		System.out.println(1);
	}
	
}
