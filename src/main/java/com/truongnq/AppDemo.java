package com.truongnq;

import com.truongnq.service.DemoService;
import com.truongnq.service.impl.EngImpl;
import com.truongnq.service.impl.ViImpl;

/**
 * @author truongnq
 * Date: 08/05/2021
 */
public class AppDemo {
    public static void main(String[] args) {
        DemoService engService = new EngImpl();
        DemoService viService = new ViImpl();

        // Constructor DI
        DemoWithConstructorDI constructorDIWithEngService = new DemoWithConstructorDI(engService);
        constructorDIWithEngService.doSomeThingWithService();

        DemoWithConstructorDI constructorDIWithViService = new DemoWithConstructorDI(viService);
        constructorDIWithViService.doSomeThingWithService();


        // Setter DI

        DemoWithSetterDI setterDI = new DemoWithSetterDI();

        setterDI.setDemoService(engService);
        setterDI.doSomeThingWithService();

        setterDI.setDemoService(viService);
        setterDI.doSomeThingWithService();



    }
}
