// using Builder design pattern
package org.example.Vehicle;

public class Vehicle {
    int vehicleNumber;

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public Vehicle setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
        return this;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public Vehicle setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
        return this;
    }

    VehicleType vehicleType;
}
