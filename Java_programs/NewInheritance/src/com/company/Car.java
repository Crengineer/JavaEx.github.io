package com.company;

public class Car extends Vehicle{

    public Car(String name, String model, int wheelNumber, int horsePower, String driverLicence, int speed, String currentDirection, String status) {
        super(name, model, wheelNumber, horsePower, driverLicence, speed, currentDirection, status);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public int getWheelNumber() {
        return 4;
    }

    @Override
    public void setWheelNumber(int wheelNumber = 4) {
        super.setWheelNumber(wheelNumber);
    }

    @Override
    public int getHorsePower() {
        return super.getHorsePower();
    }

    @Override
    public void setHorsePower(int horsePower) {
        super.setHorsePower(horsePower);
    }

    @Override
    public String getDriverLicence() {
        return super.getDriverLicence();
    }

    @Override
    public void setDriverLicence(String driverLicence) {
        super.setDriverLicence(driverLicence);
    }
}
