package com.subbak2.www.service.serviceImpl;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import com.subbak2.www.entity.test;
import com.subbak2.www.repository.TestRepository;
import com.subbak2.www.service.TestSVC;

@Service
public class TestSVCImpl implements TestSVC{

	final Logger LOGGER = org.slf4j.LoggerFactory.getLogger(this.getClass());
	
	private final TestRepository testRepository;
	
	public TestSVCImpl(TestRepository testRepository) {
		this.testRepository = testRepository;
	}
	
	@Override
	public test test(){
		return testRepository.findById(123);
	}
	

	@Override
	public List<test> testAll(){
		return testRepository.findAll();
	}
}
