package org.example.Parking;

import org.example.Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingSpotManager {
    List<ParkingSpot> parkingSpotList;



    public List<ParkingSpot> getParkingSpotList() {
        return parkingSpotList;
    }

    public void setParkingSpotList(List<ParkingSpot> parkingSpotList) {
        this.parkingSpotList = parkingSpotList;
    }

    public ParkingSpotManager(List<ParkingSpot> parkingSpotList) {
        this.parkingSpotList = parkingSpotList;
    }

    public ParkingSpot findParkingSpot(){
        for(ParkingSpot parkingSpot:parkingSpotList){
            if (parkingSpot.isOccupied == false)
                return parkingSpot;
        }
        return null;
    }

    public int getCountOfOccupiedSpots(){
        int count = 0;
        for(ParkingSpot parkingSpot:parkingSpotList){
            if(parkingSpot.isOccupied == true){
                count++;
            }
        }
        return count;
    }
    public void addParkingSpot(){

    }

    public void removeParkingSpot(){

    }

    public void parkVehicle(Vehicle vehicle, ParkingSpot parkingSpot){
        parkingSpot.parkVehicle(vehicle);
    }

    public void removeVehicle(ParkingSpot parkingSpot) {
        parkingSpot.removeVehicle();
    }
}
