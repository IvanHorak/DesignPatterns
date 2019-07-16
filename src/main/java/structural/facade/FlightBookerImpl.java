package structural.facade;

import structural.facade.interfaces.FlightBooker;
import structural.facade.objects.Flight;

import java.util.ArrayList;
import java.util.Date;

public class FlightBookerImpl implements FlightBooker {
    public ArrayList<Flight> getFlightsFor(Date from, Date to) {
        //returns available flights for given period
        return null;
    }
}
