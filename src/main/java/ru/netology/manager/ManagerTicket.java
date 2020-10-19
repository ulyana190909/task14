package ru.netology.manager;

import ru.netology.domain.FlightOption;
import ru.netology.repository.TicketRepository;

public class ManagerTicket {
    private TicketRepository repository;

    public ManagerTicket(TicketRepository repository) {
        this.repository = repository;
    }

    private FlightOption[] tickets = new FlightOption[0];

    public void addTicket (FlightOption ticket) {
        repository.getAll();
    }


    public FlightOption[] findTicket(String departureAirport, String arrivalAirport) {
        FlightOption[] result = new FlightOption[0];
        for (FlightOption ticket : repository.getAll()) {
            if (ticket.getArrivalAirport() == arrivalAirport);
            (ticket.getDepartureAirport() == departureAirport) {
                FlightOption[] tmp = new FlightOption[result.length + 1];
                System.arraycopy(result, 0, tmp, 0, result.length);
                tmp[tmp.length - 1] = ticket;
                result = tmp;
            }
        }
        return result;
    }
}

