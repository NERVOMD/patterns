package com.company.factorymethod.impl;

import com.company.factorymethod.ObjectCalc;

public class TriangleCalc implements ObjectCalc {
    @Override
    public double perimeter(long param) {
        return param * 3;
    }
}
