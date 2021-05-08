package com.truongnq;

import com.truongnq.service.DemoService;

/**
 * @author truongnq
 * Date: 08/05/2021
 */
public class DemoWithSetterDI {
    private DemoService demoService;

    public void setDemoService(DemoService demoService) {
        this.demoService = demoService;
    }

    public void doSomeThingWithService() {
        demoService.sayHello("SetterDI");
    }
}
