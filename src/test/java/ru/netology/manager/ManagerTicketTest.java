package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.FlightOption;
import ru.netology.domain.TicketByComparator;
import ru.netology.repository.TicketRepository;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ManagerTicketTest {
    private TicketRepository repository = new TicketRepository();
    private ManagerTicket manager = new ManagerTicket(repository);

    private FlightOption first = new FlightOption(1254, 10500, "SVO", "AYT", 260);
    private FlightOption second = new FlightOption(1547, 10500, "VKO", "DLM", 300);
    private FlightOption third = new FlightOption(1212, 8125, "SVO", "AYT", 270);
    private FlightOption fourth = new FlightOption(5862, 12600, "SVO", "AYT", 259);
    private FlightOption fifth = new FlightOption(8547, 10610, "VKO", "DLM", 297);
    private FlightOption sixth = new FlightOption(9584, 11000, "SVO", "AYT", 207);
    private FlightOption seventh = new FlightOption(5962, 15000, "VKO", "DLM", 350);
    private FlightOption eight = new FlightOption(7854, 21020, "SVO", "DLM", 310);


    @BeforeEach
    public void setUp() {
        manager = new ManagerTicket(repository);
        manager.addTicket(first);
        manager.addTicket(second);
        manager.addTicket(third);
        manager.addTicket(fourth);
        manager.addTicket(fifth);
        manager.addTicket(sixth);
        manager.addTicket(seventh);
        manager.addTicket(eight);
    }

    @Test
    public void findTicketDalaman() {
        String from = "VKO";
        String to = "DLM";
        FlightOption[] actual = manager.findTicket(from, to);
        FlightOption[] expected = new FlightOption[]{second, fifth, seventh};
        Arrays.sort(actual);
        assertArrayEquals(actual, expected);
    }


    @Test
    public void findTicketAntalya() {
        String from = "SVO";
        String to = "AYT";
        FlightOption[] actual = manager.findTicket(from, to);
        FlightOption[] expected = new FlightOption[]{third, first, sixth, fourth, eight};
        assertArrayEquals(actual, expected);
    }
    @Test
    public void findTicketAntalyaByComparator() {
        String from = "SVO";
        String to = "AYT";
        FlightOption[] actual = manager.findAllByComparator(from, to, //что сюда? );
        FlightOption[] expected = new FlightOption[]{third, first, sixth, fourth, eight};
        assertArrayEquals(actual, expected);
    }


}
