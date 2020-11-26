package com.example.nervo.nervoapp.service;

import com.example.nervo.nervoapp.RandomText;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class SimpleServiceImpl implements SimpleService {

    private final Random generatorRandom;

    public SimpleServiceImpl() {
        this.generatorRandom = new Random();
    }

    @Override
    public String getRandomName() {
        RandomText randomText = new RandomText();
        List<String> listOfNames = randomText.getNames();
        return listOfNames.get(generatorRandom.nextInt(listOfNames.size()));
    }
}
