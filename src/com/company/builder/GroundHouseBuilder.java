package com.company.builder;

public class GroundHouseBuilder extends House {

    public GroundHouseBuilder() {
        this.setApartment(false);
    }

    public GroundHouseBuilder(long rooms) {
        this.setApartment(false);
        this.setRoomNumbers(rooms);
    }
}
