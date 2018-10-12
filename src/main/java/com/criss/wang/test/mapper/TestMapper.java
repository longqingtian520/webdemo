package com.criss.wang.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.criss.wang.entity.Test;

@Mapper
public interface TestMapper {

	@Select("select id, name, age from test")
	public List<Test> getAllTest();
}
