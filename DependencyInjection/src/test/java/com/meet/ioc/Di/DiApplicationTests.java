package com.meet.ioc.Di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DiApplicationTests {

	/**
	 * Old approach to instantiate the object deliberately
	 */
	//Bimpl b = new Bimpl();

	/**
	 * New approach to inject the object created for Bimpl by Spring container
	 * as the interface is annotated as @Component runtime.
	 *
	 * Use @Autowired
	 */
	@Autowired
	Bimpl b ;

	@Test
	void contextLoads() {
		b.printinterfaceB();
	}

}
