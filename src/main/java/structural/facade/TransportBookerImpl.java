package structural.facade;

import structural.facade.interfaces.TransportBooker;
import structural.facade.objects.Transport;

import java.util.ArrayList;
import java.util.Date;

public class TransportBookerImpl implements TransportBooker {
    public ArrayList<Transport> getTransports(Date from, Date to) {
        //return available transport options within the given date range
        return null;
    }
}
