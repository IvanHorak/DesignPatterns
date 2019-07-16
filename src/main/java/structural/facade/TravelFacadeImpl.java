package structural.facade;

import structural.facade.interfaces.FlightBooker;
import structural.facade.interfaces.HotelBooker;
import structural.facade.interfaces.TransportBooker;
import structural.facade.interfaces.TravelFacade;
import structural.facade.objects.Flight;
import structural.facade.objects.Hotel;
import structural.facade.objects.Transport;

import java.util.ArrayList;
import java.util.Date;

public class TravelFacadeImpl implements TravelFacade {
    private HotelBooker hotelBooker;
    private FlightBooker flightBooker;
    private TransportBooker transportBooker;

    public TravelFacadeImpl() {
        this.hotelBooker = new HotelBookerImpl();
        this.flightBooker = new FlightBookerImpl();
        this.transportBooker = new TransportBookerImpl();
    }

    public void getFlightsAndHotels(Date from, Date to) {
        ArrayList<Flight> flights = flightBooker.getFlightsFor(from, to);
        ArrayList<Hotel> hotels = hotelBooker.getHotelNamesFor(from, to);
        ArrayList<Transport> transports = transportBooker.getTransports(from, to);
    }
}
