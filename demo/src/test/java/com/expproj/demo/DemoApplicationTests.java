package com.expproj.demo;

import com.expproj.demo.controller.HelloWorldConroller;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		HelloWorldConroller helloWorldConroller = new HelloWorldConroller();
		Model model = new BindingAwareModelMap();
		helloWorldConroller.getMessage("World",model);
		assertEquals("World",model.asMap().get("user"));

	}

}
