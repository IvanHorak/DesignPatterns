package structural.facade.interfaces;

import structural.facade.objects.Flight;

import java.util.ArrayList;
import java.util.Date;

public interface FlightBooker {
    ArrayList<Flight> getFlightsFor(Date from, Date to);
}
