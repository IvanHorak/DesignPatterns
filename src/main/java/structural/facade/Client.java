package structural.facade;

import structural.facade.interfaces.TravelFacade;

import java.util.Date;

public class Client {
    public static void main(String[] args) {
        TravelFacade travelFacade = new TravelFacadeImpl();

        travelFacade.getFlightsAndHotels(new Date(1563269275158L), new Date(1563269289959L)); //random long values
    }
}
