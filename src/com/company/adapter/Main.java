package com.company.adapter;

public class Main {
    public static void main(String[] args) {
        ClassA classA = new ClassA(1,2,3,"PW21M");
        AdapterA adapter = new AdapterA();
        Profile profile = adapter.adapterProfile(classA);
        System.out.println("Profile id = " + profile.getId());
        System.out.println("Profile nickname = " + profile.getNickname());
    }
}
