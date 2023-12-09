package org.example.Strategy;

public class RailwayTransport implements TransportStrategy {
    @Override
    public void distributeProducts() {
        System.out.println("Distributing products by railway...");
    }
}
