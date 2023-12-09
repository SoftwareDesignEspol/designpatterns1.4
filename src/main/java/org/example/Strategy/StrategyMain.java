package org.example.Strategy;

public class StrategyMain {
    public static void main(String[] args) {
        TransportStrategy transportStrategy = new RailwayTransport();
        Transporter transporter = new Transporter(transportStrategy);

        transporter.transport();
    }
}
