package com.expproj.demo.templatetest;


import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class HelloWorldControllerMockMvcTest {
    @Test
    public void test1(){
        System.out.println("--Testing tes 1--");
    }
}
