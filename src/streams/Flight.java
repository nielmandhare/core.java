package streams;

public class Flight {

    private int flightNo;
    private String carrier;
    private String source;
    private String destination;

    public Flight(int flightNo, String carrier, String source, String destination) {
        this.flightNo = flightNo;
        this.carrier = carrier;
        this.source = source;
        this.destination = destination;
    }

    public int getFlightNo() {
        return flightNo;
    }

    public String getCarrier() {
        return carrier;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    @Override
    public String toString() {
        return "Flight [Flight No=" + flightNo +
                ", Carrier=" + carrier +
                ", Source=" + source +
                ", Destination=" + destination + "]";
    }
}