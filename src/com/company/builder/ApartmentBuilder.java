package com.company.builder;

public class ApartmentBuilder extends House{

    public ApartmentBuilder() {
        this.setApartment(true);
    }

    public ApartmentBuilder(long rooms) {
        this.setApartment(true);
        this.setRoomNumbers(rooms);
    }
}
