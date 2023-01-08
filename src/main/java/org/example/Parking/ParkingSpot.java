package org.example.Parking;
import org.example.Vehicle.Vehicle;
public class ParkingSpot {
    int parkingSpotId;
    boolean isOccupied;
    int price;
    Vehicle vehicle;

    public int getParkingSpotId() {
        return parkingSpotId;
    }

    public void setParkingSpotId(int parkingSpotId) {
        this.parkingSpotId = parkingSpotId;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public int getPrice() {
        return price;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    protected void parkVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
        isOccupied = true;
        System.out.println("Vehicle with vehicle no. " + vehicle.getVehicleNumber() +" is parked in parking id : " + this.getParkingSpotId());
    }

    public void removeVehicle(){
        this.vehicle = null;
        isOccupied = false;
        System.out.println("Vehicle is removed from parking spot with number : " + this.getParkingSpotId());
    }
}
