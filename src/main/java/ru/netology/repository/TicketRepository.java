package ru.netology.repository;

import ru.netology.domain.FlightOption;

public class
TicketRepository {
    private FlightOption[] tickets = new FlightOption[0];

    public void add(FlightOption ticket) {
        int lenght = tickets.length + 1;
        FlightOption[] tmp = new FlightOption[lenght];
        System.arraycopy(tickets, 0, tmp, 0, tickets.length);
        int lastTicket = tmp.length - 1;
        tmp[lastTicket] = ticket;
        tickets = tmp;
    }

    public void removeTicket(int id) {
        int lenght = tickets.length - 1;
        FlightOption[] tmp = new FlightOption[lenght];
        int index = 0;
        for (FlightOption ticket : tickets) {
            if (ticket.getId() != id) {
                tmp[index] = ticket;
                index++;
            }
        }
        tickets = tmp;
    }

    public FlightOption[] getAll() {
        return tickets;
    }
}
