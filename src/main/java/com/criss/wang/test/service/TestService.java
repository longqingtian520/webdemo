package com.criss.wang.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.criss.wang.entity.Test;
import com.criss.wang.test.mapper.TestMapper;

@Service
public class TestService {

	@Autowired
	private TestMapper testMapper;
	
	public List<Test> getAllTest(){
		return testMapper.getAllTest();
	}
}
