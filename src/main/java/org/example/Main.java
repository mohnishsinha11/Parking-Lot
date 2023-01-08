package org.example;

import org.example.Parking.*;
import org.example.Vehicle.Vehicle;
import org.example.Vehicle.VehicleType;
import org.example.domain.EntranceGate;
import org.example.domain.ParkingApplicationDriver;
import org.example.domain.Ticket;

public class Main {
    public static void main(String[] args) {
        System.out.println("******************* Parking Spot *******************");
        ParkingApplicationDriver parkingApplicationDriver = new ParkingApplicationDriver();
        parkingApplicationDriver.startParkingSpot();
    }
}