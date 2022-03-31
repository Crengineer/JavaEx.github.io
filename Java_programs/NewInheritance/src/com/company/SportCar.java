package com.company;

public class SportCar extends Car{
    public SportCar(String name, String model, int wheelNumber, int horsePower, String driverLicence) {
        super(name, model, wheelNumber=4, horsePower, driverLicence="S");
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
    public void setWheelNumber(int wheelNumber) {
        super.setWheelNumber(wheelNumber=4);
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
        return "S";
    }

    @Override
    public void setDriverLicence(String driverLicence) {
        super.setDriverLicence(driverLicence="S");
    }
}
