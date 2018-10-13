package com.criss.wang.test.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.criss.wang.entity.Test;
import com.criss.wang.test.service.TestService;

@Controller
public class TestController {
	
	@Autowired
	private TestService testService;

	@ResponseBody
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		
		return "hello";
	}
	
	@RequestMapping(value = "/success")
	public String success(Map<String, String> map) {
		map.put("hello", "nihao");
		map.put("criss", "王秋宝");
		return "success";
	}
	
	@ResponseBody
	@RequestMapping(value = "/all/test", method = RequestMethod.GET)
	public List<Test> test1() {
		List<Test> tests = testService.getAllTest();
		return tests;
	}
}
