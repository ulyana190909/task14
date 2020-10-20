package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class FlightOption implements Comparable {
    private int id;
    private int price;
    private String departureFlight;
    private String arrivalFlight;
    private int flightTime;

    @Override
    public int compareTo(Object o) {
        FlightOption ticket = (FlightOption) o;
        return price - ticket.price;
    }

    public interface Comparable<T> {
        public int compareTo();

    }
}