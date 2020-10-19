package ru.netology.manager;

import ru.netology.domain.FlightOption;
import ru.netology.repository.TicketRepository;

import java.util.Arrays;
import java.util.Comparator;

public class ManagerTicket {
    private TicketRepository repository;

    public ManagerTicket(TicketRepository repository) {
        this.repository = repository;
    }

    private FlightOption[] tickets = new FlightOption[0];

    public void addTicket(FlightOption ticket) {
        repository.getAll();
    }

    public FlightOption[] findTicket(String from, String to) {
        FlightOption[] result = new FlightOption[0];
        for (FlightOption ticket : repository.getAll()) {
            if (ticket.getDepartureFlight().equals(from) && ticket.getArrivalFlight().equals(to)) {
                FlightOption[] tmp = new FlightOption[result.length + 1];
                System.arraycopy(result, 0, tmp, 0, result.length);
                tmp[tmp.length - 1] = ticket;
                result = tmp;
                Arrays.sort(result);
            }
        }
        return result;
    }

    public FlightOption[] findAllByComparator(String from, String to, Comparator<FlightOption> comparator) {
        FlightOption[] result = new FlightOption[0];
        for (FlightOption ticket : repository.getAll()) {
            if (ticket.getDepartureFlight().equals(from) && ticket.getArrivalFlight().equals(to)) {
                FlightOption[] tmp = new FlightOption[result.length + 1];
                System.arraycopy(result, 0, tmp, 0, result.length);
                tmp[tmp.length - 1] = ticket;
                result = tmp;
                Arrays.sort(result, comparator);
            }
        }
        return result;
    }
}

