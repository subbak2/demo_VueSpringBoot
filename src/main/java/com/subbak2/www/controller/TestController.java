package com.subbak2.www.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subbak2.www.entity.test;
import com.subbak2.www.service.TestSVC;

@RestController
@RequestMapping("/test")
public class TestController {
	private final TestSVC testSVC;
	
	public TestController(TestSVC testSVC) {
		this.testSVC = testSVC;
	}
	
	@GetMapping("/test")
	ResponseEntity<test> getTest(){
		test testInfo = testSVC.test();
		return new ResponseEntity<>(testInfo, HttpStatus.OK);
	}

	@GetMapping("/testAll")
	ResponseEntity<List<test>> getTestAll(){
		return new ResponseEntity<>(testSVC.testAll(), HttpStatus.OK);
	}
}
