package org.example.domain;

import org.example.Parking.ParkingManagerFactory;
import org.example.Parking.ParkingSpot;
import org.example.Parking.ParkingSpotManager;
import org.example.Vehicle.VehicleType;

public class ExitGate {
    ParkingManagerFactory parkingManagerFactory;
    ParkingSpotManager parkingSpotManager;

    public ExitGate(ParkingManagerFactory parkingManagerFactory) {
        this.parkingManagerFactory = parkingManagerFactory;
    }

    double calculateFare(Ticket ticket){
        ParkingSpot parkingSpot = ticket.getParkingSpot();
        double fare=10;
        return fare + parkingSpot.getPrice();
    }

    void removeVehicleFromParkingSpot(Ticket ticket){
        VehicleType vehicleType = ticket.getVehicle().getVehicleType();
        ParkingSpot parkingSpot = ticket.getParkingSpot();

        parkingSpotManager = parkingManagerFactory.getParkingSpotManager(vehicleType);
        parkingSpotManager.removeVehicle(ticket.getParkingSpot());
    }

    void paymentDone(){

    }
}
