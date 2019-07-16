package structural.facade.interfaces;

import structural.facade.objects.Transport;

import java.util.ArrayList;
import java.util.Date;

public interface TransportBooker {
    ArrayList<Transport> getTransports(Date from, Date to);
}
