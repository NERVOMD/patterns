package com.company.factorymethod.impl;

import com.company.factorymethod.ObjectCalc;

public class SquareCalc implements ObjectCalc {
    @Override
    public double perimeter(long param) {
        return 4 * param;
    }
}
