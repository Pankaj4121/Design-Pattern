package com.DesignPattern.Design.Pattern.AbstractFactory;

public class BikeFactory implements VehicleAbstractFactory{
    @Override
    public Vehicle createVehicle() {
        return new Bike();
    }
}
