package com.subbak2.www.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.subbak2.www.entity.test;

@Repository
public interface TestRepository {
	
	test findById(Integer id);
	List<test> findAll();
}
