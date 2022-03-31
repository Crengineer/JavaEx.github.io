package com.company;

public class Vehicle {
    private String name;
    private String model;
    private int wheelNumber;
    private int horsePower;
    private String driverLicence;

    public Vehicle(String name, String model, int wheelNumber, int horsePower, String driverLicence) {
        this.name = name;
        this.model = model;
        this.wheelNumber = wheelNumber;
        this.horsePower = horsePower;
        this.driverLicence = driverLicence;
    }

    //NAME GET & SET
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //MODEL GET & SET
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    //WHEEL NUMBER GET & SET
    public int getWheelNumber() {
        return wheelNumber;
    }

    public void setWheelNumber(int wheelNumber) {
        this.wheelNumber = wheelNumber;
    }

    //HORSE POWER GET & SET
    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    //DRIVER LICENSE GET & SET
    public String getDriverLicence() {
        return driverLicence;
    }

    public void setDriverLicence(String driverLicence) {
        this.driverLicence = driverLicence;
    }

}
