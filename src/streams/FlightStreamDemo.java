package streams;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightStreamDemo {

    public static void main(String[] args) throws Exception {

        Stream<String> lines = Files.lines(Paths.get("src/streams/flightdata.txt"));

        List<Flight> flights = lines
                .map(line -> {
                    String[] record = line.split(",");
                    return new Flight(
                            Integer.parseInt(record[0]),
                            record[1],
                            record[2],
                            record[3]);
                })
                .collect(Collectors.toList());

        System.out.println("All Flights");
        flights.forEach(System.out::println);

        // Print details of flight no 123
        System.out.println("\nFlight No 123");
        flights.stream()
                .filter(f -> f.getFlightNo() == 123)
                .forEach(System.out::println);

        // Print all flights by Jet carrier
        System.out.println("\nFlights of Jet Carrier");
        flights.stream()
                .filter(f -> f.getCarrier().equalsIgnoreCase("Jet"))
                .forEach(System.out::println);

        // Print flight going Pune to Delhi
        System.out.println("\nFlight from Pune to Delhi");
        flights.stream()
                .filter(f -> f.getSource().equalsIgnoreCase("Pune")
                        && f.getDestination().equalsIgnoreCase("Delhi"))
                .forEach(System.out::println);

        // Remove flight no 920
        flights.removeIf(f -> f.getFlightNo() == 920);

        System.out.println("\nAfter Removing Flight No 920");
        flights.forEach(System.out::println);
    }
}