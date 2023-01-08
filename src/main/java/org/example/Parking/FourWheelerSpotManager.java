package org.example.Parking;
import java.util.ArrayList;

public class FourWheelerSpotManager extends ParkingSpotManager{
    public FourWheelerSpotManager() {
        super(new ArrayList<>());
        for(int i=1;i<=400;i++){
            ParkingSpot parkingSpot = new FourWheelerSpot();
            parkingSpot.setOccupied(false);
            parkingSpot.setParkingSpotId(600+i);
            parkingSpotList.add(parkingSpot);
        }
    }
}
