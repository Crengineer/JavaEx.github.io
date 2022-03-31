package com.company;

public class Vehicle {
    private String name;
    private String model;
    private int wheelNumber;
    private int horsePower;
    private String driverLicence;

    private int speed;
    private String currentDirection;
    private String status;

    public Vehicle(String name, String model, int wheelNumber, int horsePower, String driverLicence, int speed, String currentDirection, String status) {
        this.name = name;
        this.model = model;
        this.wheelNumber = wheelNumber;
        this.horsePower = horsePower;
        this.driverLicence = driverLicence;
        this.speed = speed;
        this.currentDirection = currentDirection;
        this.status = status;
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

    //SPEED GET & SET

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    //CURRENT DIRECTION GET & SET

    public String getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(String currentDirection) {
        this.currentDirection = currentDirection;
    }

    //STATUS GET & SET

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // METHODS

    //STEERING RIGHT AND LEFT

    public void steerRight(){
        if(getStatus().equals("Off")){
            System.out.println("Cannot turn the vehicle, because is off.");
            return;
        }
        if(getCurrentDirection().equals("Right")){
            setCurrentDirection("Right");
            return;
        }
        if(getCurrentDirection().equals("Straight")){
            setCurrentDirection("Right");
            return;
        }
        if(getCurrentDirection().equals("Left")){
            setCurrentDirection("Straight");
            return;
        }
    }

    public void steerLeft(){
        if(getStatus().equals("Off")){
            System.out.println("Cannot turn the vehicle, because is off.");
            return;
        }
        if(getCurrentDirection().equals("Right")){
            setCurrentDirection("Straight");
            return;
        }
        if(getCurrentDirection().equals("Straight")){
            setCurrentDirection("Left");
            return;
        }
        if(getCurrentDirection().equals("Left")){
            setCurrentDirection("Left");
            return;
        }
    }

    //SWITCHES OF THE ENGINE

    public void switchOn(){
        if(getStatus().equals("On")){
            System.out.println("The vehicle is already on.");
            return;
        }
        if(getStatus().equals("Off")){
            setStatus("On");
            return;
        }
    }

    public void switchOff(){
        if(getStatus().equals("Off")){
            System.out.println("The vehicle is already off.");
            return;
        }
        if(getStatus().equals("On")){
            setStatus("Off");
            setSpeed(0);
            return;
        }
    }

    public void stop(){
        setSpeed(0);
        return;
    }


}
