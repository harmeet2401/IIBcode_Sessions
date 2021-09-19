package com.expproj.demo.templatetest;

import com.expproj.demo.bean.userBean;
import com.expproj.demo.controller.HelloWorldConroller;
import com.expproj.demo.service.ServiceClass;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class DemoApplicationTests {

	@Autowired  // this we could able to autowired bcse its annotated as @Service which comes under the component scan and got registred on bean list in applicationcontext
	ServiceClass serviceClass;

	@Test
	void contextLoads() {
		HelloWorldConroller helloWorldConroller = new HelloWorldConroller();
		Model model = new BindingAwareModelMap();
		helloWorldConroller.getMessage("World",model);
		assertEquals("World",model.asMap().get("user"));
	}
	@Test
	void callingOtherRest(){
		userBean userUsingHttphit = serviceClass.getUserUsingHttphit();
		assertTrue(!userUsingHttphit.getName().isEmpty());
	}

}
