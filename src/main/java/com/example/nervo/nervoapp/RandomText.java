package com.example.nervo.nervoapp;

import lombok.*;

import java.util.Arrays;
import java.util.List;

@Data
public class RandomText {
    List<String> names;

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public RandomText() {
        this.names = Arrays.asList("Elina", "Alexandru", "Ion", "Andrei");
    }
}
