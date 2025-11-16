package com.DesignPattern.Design.Pattern.AbstractFactory;

public class CarFactory implements VehicleAbstractFactory{
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
