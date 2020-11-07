package com.company.iterator;

import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    static Set<String> listString = Stream.of("a", "b", "c", "e").collect(Collectors.toSet());

    static Iterator iterator = listString.iterator();

    public static void main(String[] args) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
