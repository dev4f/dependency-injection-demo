package com.truongnq;

import com.truongnq.service.DemoService;

/**
 * @author truongnq
 * Date: 08/05/2021
 */
public class DemoWithConstructorDI {
    private final DemoService demoService;

    public DemoWithConstructorDI(DemoService demoService) {
        this.demoService = demoService;
    }

    public void doSomeThingWithService() {
        demoService.sayHello("ConstructorDI");
    }

}
