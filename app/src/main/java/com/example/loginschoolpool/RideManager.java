package com.example.loginschoolpool;

import java.util.List;

public class RideManager {
    private static List<Ride> rideDb;

    // This method adds Passenger to an existing Ride.
    // Returns True if succeeded, False if there is no place in the car.
    public static boolean addPassengerToRide(User newPassenger, Ride rideToAdd){
        if(rideToAdd.getAvailableSeats() == 0){
            return false;
        }
        List<User> allPassengers = rideToAdd.getPassengers();
        allPassengers.add(newPassenger);
        rideToAdd.setPassengers(allPassengers);
        rideToAdd.setAvailableSeats(rideToAdd.getAvailableSeats() - 1);
        return true;
    }

    // Getters and Setters
    public static void setRideDb(List<Ride> rideDb) {
        RideManager.rideDb = rideDb;
    }
    public static List<Ride> getRideDb() {
        return rideDb;
    }
}
