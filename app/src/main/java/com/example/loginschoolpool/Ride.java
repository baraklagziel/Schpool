package com.example.loginschoolpool;

import java.util.List;

public class Ride {
    private String driverName;
    private String licensePlateNumber;
    private String availableSeats;
    private String startingPoint;
    private String timeOfDeparture;
    private String dayOfMonth;
    private List<User> passengers;

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }
    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }
    public void setAvailableSeats(String availableSeats) {
        this.availableSeats = availableSeats;
    }
    public void setStartingPoint(String startingPoint) {
        this.startingPoint = startingPoint;
    }
    public void setTimeOfDeparture(String timeOfDeparture) {
        this.timeOfDeparture = timeOfDeparture;
    }
    public void setDayOfMonth(String dayOfMonth) {
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
    public String getAvailableSeats() {
        return availableSeats;
    }
    public String getStartingPoint() {
        return startingPoint;
    }
    public String getTimeOfDeparture() {
        return timeOfDeparture;
    }
    public String getDayOfMonth() {
        return dayOfMonth;
    }
    public List<User> getPassengers() {
        return passengers;
    }





}
