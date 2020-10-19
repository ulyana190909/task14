package ru.netology.manager;

import ru.netology.domain.FlightOption;
import ru.netology.repository.TicketRepository;

public class ManagerTicket {
    private TicketRepository repository;

    public ManagerTicket(TicketRepository repository) {
        this.repository = repository;
    }

    //здесь метод отбора
    public boolean findAll(FlightOption[] departureAirport,FlightOption[] arrivalAirport) {
        for (FlightOption ticket : repository.getAll()) {
        if (ticket.getDepartureAirport() == departureAirport){
            return true;
        }
        if (ticket.getArrivalAirport() == arrivalAirport) {
            return true;
        }
        return false;
    }

//    public FlightOption[] searchTicket(String departureAirport, String arrivalAirport) {
//        FlightOption[] result = new FlightOption[0];
//        for (FlightOption ticket : repository.getAll()) {
//            if (departureAirport = ticket) ;
//            (arrivalAirport = ticket) {
//                FlightOption[] tmp = new FlightOption[result.length + 1];
//                System.arraycopy(result, 0, tmp, 0, result.length);
//                tmp[tmp.length - 1] = ticket;
//                result = tmp;
//            }
//        }
//        return result;
//    }
}
//здесь должна быть сортировка

