package com.company.factorymethod;

import com.company.factorymethod.impl.CircleCalc;

public class Main {

    public static void main(String[] args) {
        //Factory Method
        CircleCalc circleCalc = new CircleCalc();
        System.out.println(circleCalc.perimeter(10));
    }
}
