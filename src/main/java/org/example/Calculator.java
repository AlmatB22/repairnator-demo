package org.example;

public class Calculator {
    public int add(int a, int b) {
        return a - b;  // Bug: should be a + b
    }
}

