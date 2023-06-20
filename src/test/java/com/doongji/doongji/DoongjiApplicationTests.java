package com.doongji.doongji;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;

import com.doongji.doongji.test.TestController;
import com.doongji.doongji.test.TestService;

@SpringBootTest
@ActiveProfiles("dev")
class DoongjiApplicationTests {

	@Autowired
	private TestController testController;

	@Test
	void test(){

	}

}
