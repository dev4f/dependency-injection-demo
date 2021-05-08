package com.truongnq.service.impl;

import com.truongnq.service.DemoService;

/**
 * @author truongnq
 * Date: 08/05/2021
 */
public class ViImpl implements DemoService {
    @Override
    public void sayHello(String name) {
        System.out.printf("Xin chào từ: %s \n", name);
    }
}
