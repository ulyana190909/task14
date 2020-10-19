package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class FlightOption implements Comparable {
    private int id;
    private int coast;
    private String departureAirport;
    private String arrivalAirport;
    private int travelTime;

    @Override
    public int compareTo(Object o) {
        FlightOption flightOption = (FlightOption) o;
        return id - flightOption.id;
    }

    public interface Comparable <T> {
        public int compareTo (FlightOption T o);
    }
}