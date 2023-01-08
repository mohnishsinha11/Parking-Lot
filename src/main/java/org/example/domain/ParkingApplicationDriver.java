package org.example.domain;

import org.example.Parking.*;
import org.example.Vehicle.Vehicle;
import org.example.Vehicle.VehicleType;

public class ParkingApplicationDriver {

    ParkingManagerFactory parkingManagerFactory;
    EntranceGate entranceGate;
    ExitGate exitGate;

    public ParkingApplicationDriver(){
        initializeParkingSpot();
    }

    private void initializeParkingSpot() {
        parkingManagerFactory = new ParkingManagerFactory();
        entranceGate = new EntranceGate(parkingManagerFactory);
        exitGate = new ExitGate(parkingManagerFactory);
    }

    public void startParkingSpot(){

        Vehicle vehicle1 = new Vehicle().setVehicleType(VehicleType.FOUR_WHEELER).setVehicleNumber(1204);
        ParkingSpot parkingSpot1 = entranceGate.findParkingSpot(vehicle1.getVehicleType());
        entranceGate.bookParkingSpot(vehicle1, parkingSpot1);
        Ticket ticket1 = entranceGate.generateTicket(vehicle1, parkingSpot1, 1100);


        Vehicle vehicle2 = new Vehicle().setVehicleType(VehicleType.FOUR_WHEELER).setVehicleNumber(8800);
        ParkingSpot parkingSpot2 = entranceGate.findParkingSpot(vehicle2.getVehicleType());
        entranceGate.bookParkingSpot(vehicle2, parkingSpot2);
        Ticket ticket2 = entranceGate.generateTicket(vehicle2, parkingSpot2, 1300);

        Vehicle vehicle3 = new Vehicle().setVehicleType(VehicleType.TWO_WHEELER).setVehicleNumber(7909);
        ParkingSpot parkingSpot3 = entranceGate.findParkingSpot(vehicle3.getVehicleType());
        entranceGate.bookParkingSpot(vehicle3, parkingSpot3);
        Ticket ticket3 = entranceGate.generateTicket(vehicle3, parkingSpot3, 1500);

        double fare = exitGate.calculateFare(ticket1);
        System.out.println("Fare for vehicle with vehicle number : "+ ticket1.getVehicle().getVehicleNumber()
                +" is : "+ fare +" Rupees only");
        exitGate.removeVehicleFromParkingSpot(ticket1);

//        System.out.println("Two wheeler spots : "+ twoWheelerParkingSpotManager.getParkingSpotList().size());
//        System.out.println("Four wheeler spots : "+ fourWheelerParkingSpotManager.getParkingSpotList().size());
//
//        System.out.println("Two Wheeler spot price : " + twoWheelerParkingSpotManager.getParkingSpotList().get(0).getPrice());
//        System.out.println("Four Wheeler spot price : " + fourWheelerParkingSpotManager.getParkingSpotList().get(0).getPrice());

    }
}
