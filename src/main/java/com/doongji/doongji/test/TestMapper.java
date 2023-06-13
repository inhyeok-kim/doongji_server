package com.doongji.doongji.test;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.doongji.doongji.model.TestModel;

@Mapper
public interface TestMapper {
    
    List<TestModel> selectModel();
}
