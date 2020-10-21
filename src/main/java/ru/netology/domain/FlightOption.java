package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class FlightOption implements Comparable<FlightOption> {
    private int id;
    private int price;
    private String departureFlight;
    private String arrivalFlight;
    private int flightTime;

    @Override
    public int compareTo(FlightOption o) {
        FlightOption ticket = (FlightOption) o;
        return price - ticket.price;

    }
}