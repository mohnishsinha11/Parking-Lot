package org.example.Parking;
import java.util.ArrayList;

public class TwoWheelerSpotManager extends ParkingSpotManager{
    public TwoWheelerSpotManager() {
        super(new ArrayList<>());
        for(int i=1;i<=600;i++){
            ParkingSpot parkingSpot = new TwoWheelerSpot();
            parkingSpot.setOccupied(false);
            parkingSpot.setParkingSpotId(i);
            parkingSpotList.add(parkingSpot);
        }
    }
}

