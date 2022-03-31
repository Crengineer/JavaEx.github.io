package com.company;

public class SportCar extends Car{

    public SportCar(String name, String model, int wheelNumber, int horsePower, String driverLicence, int speed, String currentDirection, String status, int gear) {
        super(name, model, wheelNumber, horsePower, driverLicence, speed, currentDirection, status, gear);
    }

    public String getName() {
        return super.getName();
    }

    public void setName(String name) {
        super.setName(name);
    }

    public String getModel() {
        return super.getModel();
    }

    public void setModel(String model) {
        super.setModel(model);
    }

    public int getWheelNumber() {
        return super.getWheelNumber();
    }

    public void setWheelNumber(int wheelNumber) {
        super.setWheelNumber(wheelNumber);
    }

    public int getHorsePower() {
        return super.getHorsePower();
    }

    public void setHorsePower(int horsePower) {
        super.setHorsePower(horsePower);
    }

    public String getDriverLicence() {
        return super.getDriverLicence();
    }

    public void setDriverLicence(String driverLicence) {
        super.setDriverLicence(driverLicence);
    }

    public int getSpeed() {
        return super.getSpeed();
    }

    public void setSpeed(int speed) {
        super.setSpeed(speed);
    }

    public String getCurrentDirection() {
        return super.getCurrentDirection();
    }

    public void setCurrentDirection(String currentDirection) {
        super.setCurrentDirection(currentDirection);
    }

    public String getStatus() {
        return super.getStatus();
    }

    public void setStatus(String status) {
        super.setStatus(status);
    }

    public void steerRight() {
        super.steerRight();
    }

    public int getGear() {
        return super.getGear();
    }

    public void setGear(int gear) {
        super.setGear(gear);
    }

    public void steerLeft() {
        super.steerLeft();
    }

    public void switchOn() {
        super.switchOn();
    }

    public void switchOff() {
        super.switchOff();
    }

    public void stop() {
        super.stop();
    }

    public void increaseSpeed(int rate) {
        super.increaseSpeed(rate);
    }

    public void decreaseSpeed(int rate) {
        super.decreaseSpeed(rate);
    }

    @Override
    public void gearSetting() {
        if(getSpeed() >= 0 && getSpeed() <=10){
            setGear(1);
            return;
        }
        if(getSpeed() > 10 && getSpeed() <=20){
            setGear(2);
            return;
        }
        if(getSpeed() > 20 && getSpeed() <=50){
            setGear(3);
            return;
        }
        if(getSpeed() > 50 && getSpeed() <=70){
            setGear(4);
            return;
        }
        if(getSpeed()>=70 && getSpeed()<=90){
            setGear(5);
            return;
        }
        if(getSpeed()>=90){
            setGear(6);
            return;
        }
    }
}
