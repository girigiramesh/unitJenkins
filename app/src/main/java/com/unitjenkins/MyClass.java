package com.unitjenkins;

/**
 * Created by Hari Prasad on 3/16/17.
 */

public class MyClass {
    public MyClass() {
    }

    public boolean compare(int a, int b) {
        if (a >= b)
            return true;
        return false;
    }

    public int sum(int a, int b) {
        return (a + b);
    }

    public String getString() {
        return "Hello World";
    }
}
