package com.company.factorymethod.impl;

import com.company.factorymethod.ObjectCalc;

public class CircleCalc implements ObjectCalc {
    @Override
    public double perimeter(long param) {
        return (2 * 3.14 * param);
    }
}
