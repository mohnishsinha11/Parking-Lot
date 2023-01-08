package org.example.domain;

import org.example.Parking.ParkingManagerFactory;
import org.example.Parking.ParkingSpot;
import org.example.Parking.ParkingSpotManager;
import org.example.Vehicle.Vehicle;
import org.example.Vehicle.VehicleType;

public class EntranceGate {
    ParkingManagerFactory parkingManagerFactory;
    ParkingSpotManager parkingSpotManager;
    Ticket ticket;

    public EntranceGate(ParkingManagerFactory parkingManagerFactory) {
        this.parkingManagerFactory = parkingManagerFactory;
    }

    public Ticket getTicket() {
        return ticket;
    }

    ParkingSpot findParkingSpot(VehicleType vehicleType){
        parkingSpotManager = parkingManagerFactory.getParkingSpotManager(vehicleType);
        ParkingSpot parkingSpot = parkingSpotManager.findParkingSpot();

        return parkingSpot;
    }

    void bookParkingSpot(Vehicle vehicle, ParkingSpot parkingSpot){
        parkingSpotManager.parkVehicle(vehicle, parkingSpot);
        System.out.println("No. of parked vehicles : " + parkingSpotManager.getCountOfOccupiedSpots());
    }

    public Ticket generateTicket(Vehicle vehicle, ParkingSpot parkingSpot, long entryTime){
        System.out.println("Ticket generated for Vehicle Number : "+ vehicle.getVehicleNumber()+" parked at : "+parkingSpot.getParkingSpotId());
        ticket = new Ticket()
                .setEntryTime(entryTime)
                .setVehicle(vehicle)
                .setParkingSpot(parkingSpot);
        return ticket;
    }
}
