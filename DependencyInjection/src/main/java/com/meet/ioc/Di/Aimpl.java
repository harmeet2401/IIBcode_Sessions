package com.meet.ioc.Di;
import org.springframework.stereotype.Component;

@Component
public class Aimpl implements InterfaceA{
    @Override
    public void printinterfaceA() {
        System.out.println("Implementing the interface A method");
    }
}
