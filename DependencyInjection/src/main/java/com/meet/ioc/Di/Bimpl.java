package com.meet.ioc.Di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * This class shows how we are Dependency injecting the InterfaceA class object using
 *  1. FIELD LEVEL DI
 *  2. SETTER LEVEL DI
 *  3. CONSTRUCTOR LEVEL DI
 */
@Component
public class Bimpl implements InterfaceB{

    /**
     * Old approach to instantiate the object deliberately
     */
    //InterfaceA a = new Aimpl();

    /**
     * New approach to inject the object created for InterfaceA by Spring container
     * as the interface is annotated as @Component runtime.
     * FIELD LEVEL DI
     * Use @Autowired
     */
        InterfaceA a ;

    /**
     * New approach to inject the object created for InterfaceA by Spring container
     * as the interface is annotated as @Component runtime.
     * CONSTRUCTOR LEVEL DI
     * Use @Autowired
     */
        @Autowired
        public Bimpl(InterfaceA a){
                this.a=a;
        }
    @Override
    public void printinterfaceB() {
        System.out.println("Implementing the interface B method and then use the InterfaceA" +
                "to runs B methods.");
        a.printinterfaceA();

    }
    public InterfaceA getA() {
        return a;
    }

    /**
     * New approach to inject the object created for InterfaceA by Spring container
     * as the interface is annotated as @Component runtime.
     * SETTER LEVEL DI
     * Use @Autowired
     */
    /*@Autowired
    public void setA(InterfaceA a) {
        this.a = a;
    }*/
}
