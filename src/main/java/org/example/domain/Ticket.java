package org.example.domain;

import org.example.Parking.ParkingSpot;
import org.example.Vehicle.Vehicle;

public class Ticket {
    long entryTime;
    Vehicle vehicle;
    ParkingSpot parkingSpot;

    public long getEntryTime() {
        return entryTime;
    }

    public Ticket setEntryTime(long entryTime) {
        this.entryTime = entryTime;
        return this;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Ticket setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        return this;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public Ticket setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
        return this;
    }
}
