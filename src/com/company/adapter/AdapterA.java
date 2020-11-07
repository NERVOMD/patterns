package com.company.adapter;

public class AdapterA {
    public Profile adapterProfile(ClassA a) {
        Profile profile = new Profile();
        profile.setId(a.id);
        profile.setNickname(a.nickname);
        return profile;
    };
}
