package com.core.springcomponentdemo;

import org.springframework.stereotype.Component;

@Component("MathCom")
public class MathComponent {

    public int add(int x, int y) {
        return (x + y);
    }

}
