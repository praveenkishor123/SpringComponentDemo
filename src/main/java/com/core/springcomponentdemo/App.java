package com.core.springcomponentdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.core.springcomponentdemo");
        context.refresh();

//        MathComponent ms = context.getBean(MathComponent.class); // This is used when we don't provide name to our bean
        MathComponent ms = (MathComponent) context.getBean("MathCom");
        int result = ms.add(100000, 2763737);
        System.out.println(result);

        context.close();
    }
}
