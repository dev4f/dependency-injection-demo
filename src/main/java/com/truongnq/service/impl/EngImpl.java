package com.truongnq.service.impl;

import com.truongnq.service.DemoService;

/**
 * @author truongnq
 * Date: 08/05/2021
 */
public class EngImpl implements DemoService {
    @Override
    public void sayHello(String name) {
        System.out.printf("Hello from: %s \n", name);
    }
}
