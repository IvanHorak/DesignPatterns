package structural.facade.interfaces;

import structural.facade.objects.Hotel;

import java.util.ArrayList;
import java.util.Date;

public interface HotelBooker {
    ArrayList<Hotel> getHotelNamesFor(Date from, Date to);
}
