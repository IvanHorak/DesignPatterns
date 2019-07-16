package structural.facade;

import structural.facade.interfaces.HotelBooker;
import structural.facade.objects.Hotel;

import java.util.ArrayList;
import java.util.Date;

public class HotelBookerImpl implements HotelBooker {
    public ArrayList<Hotel> getHotelNamesFor(Date from, Date to) {
        //returns hotels available in the date range
        return null;
    }
}
