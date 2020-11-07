package com.company.builder;

public class Main {
    public static void main(String[] args) {
        ApartmentBuilder apartmentBuilder = new ApartmentBuilder(3);
        GroundHouseBuilder groundHouseBuilder = new GroundHouseBuilder(1);
        System.out.println("Apartment");
        System.out.println("Rooms : " + apartmentBuilder.getRoomNumbers() + "\nis it apartment?: " + apartmentBuilder.isApartment());
        System.out.println("House");
        System.out.println("Rooms : " + groundHouseBuilder.getRoomNumbers() + "\nis it apartment?: " + groundHouseBuilder.isApartment());
    }
}
