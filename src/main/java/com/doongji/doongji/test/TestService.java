package com.doongji.doongji.test;

import org.springframework.stereotype.Service;

import com.doongji.doongji.model.TestModel;

@Service
public class TestService {

    private TestMapper testMapper;

    public TestService(TestMapper _testMapper){
        this.testMapper = _testMapper;
    }

    public String getTest(){
        
        return "yes.. hi";
    }

    public TestModel getModel(){
        TestModel model = new TestModel();
        model.setId("momodel");
        return model;
    }
    
}
