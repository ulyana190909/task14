package ru.netology.manager;

import ru.netology.domain.FlightOption;
import ru.netology.repository.TicketRepository;

public class ManagerTicketTest {
    private TicketRepository repository = new TicketRepository();
    private ManagerTicket manager = new ManagerTicket(repository);

//    private FlightOption first = new FlightOption[] {1254, 10500, "SVO", "AYT", 4};
//

//
//    private int id;
//    private int coast;
//    private String departureAirport;
//    private String arrivalAirport;
//    private int travelTime;
}
