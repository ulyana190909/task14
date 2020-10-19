package ru.netology.domain;

import java.util.Comparator;


public class TicketByComparator implements Comparator<FlightOption> {
    @Override
    public int compare(FlightOption o1, FlightOption o2) {
        return o1.getFlightTime() - o2.getFlightTime();
    }
}
