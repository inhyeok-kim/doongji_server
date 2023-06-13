package com.doongji.doongji.test;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    private TestService testService;
    public TestController(TestService _testService){
        testService = _testService;
    }

    @Value("${run.type}")
    private String test;

    @RequestMapping("")
    public String index(HttpServletRequest req){
        System.out.println(test);
        String result = testService.getTest();
        return result;
    }
}
