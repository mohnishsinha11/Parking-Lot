// uses factory design pattern
package org.example.Parking;

import org.example.Vehicle.VehicleType;

public class ParkingManagerFactory {
    TwoWheelerSpotManager twoWheelerSpotManager;
    FourWheelerSpotManager fourWheelerSpotManager;

    public ParkingManagerFactory(){
        twoWheelerSpotManager = new TwoWheelerSpotManager();
        fourWheelerSpotManager = new FourWheelerSpotManager();
    }
    public ParkingSpotManager getParkingSpotManager(VehicleType vehicleType) {
        if(vehicleType.equals(VehicleType.TWO_WHEELER))
            return twoWheelerSpotManager;
        else
            return fourWheelerSpotManager;
    }
}
