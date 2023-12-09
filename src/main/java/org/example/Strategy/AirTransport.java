package org.example.Strategy;

public class AirTransport implements TransportStrategy {
    @Override
    public void distributeProducts() {
        System.out.println("Distributing products by air...");
    }
}
