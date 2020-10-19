package ru.netology.domain;

import java.util.Comparator;

import static jdk.vm.ci.sparc.SPARC.o1;
import static jdk.vm.ci.sparc.SPARC.o2;

public class TicketByComparator implements Comparator<FlightOption> {
    @Override
    public int compare(FlightOption o1, FlightOption o2) {
        return o1.getTravelTime() - o2.getTravelTime();
    }
}
