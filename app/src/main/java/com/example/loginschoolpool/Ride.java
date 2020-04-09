package com.example.loginschoolpool;

import java.util.List;

public class Ride {
    private String driverName;
    private String licensePlateNumber;
    private int availableSeats;
    private String startingPoint;
    private int dayOfMonth;
    private int monthOfDeparture;
    private int timeOfDeparture;
    private List<User> passengers;

    // Getters and Setters
    public void setTimeOfDeparture(int timeOfDeparture) {
        this.timeOfDeparture = timeOfDeparture;
    }
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }
    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }
    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }
    public void setStartingPoint(String startingPoint) {
        this.startingPoint = startingPoint;
    }
    public void setDayOfMonth(int dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }
    public void setPassengers(List<User> passengers) {
        this.passengers = passengers;
    }
    public String getDriverName() {
        return driverName;
    }
    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }
    public int getAvailableSeats() {
        return availableSeats;
    }
    public String getStartingPoint() {
        return startingPoint;
    }
    public int getDayOfMonth() {
        return dayOfMonth;
    }
    public List<User> getPassengers() {
        return passengers;
    }
    public int getTimeOfDeparture() {
        return timeOfDeparture;
    }
    public int getMonthOfDeparture() {
        return monthOfDeparture;
    }
    public void setMonthOfDeparture(int monthOfDeparture) {
        this.monthOfDeparture = monthOfDeparture;
    }
}
