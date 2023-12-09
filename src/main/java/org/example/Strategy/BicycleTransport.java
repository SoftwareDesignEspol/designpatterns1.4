package org.example.Strategy;

public class BicycleTransport implements TransportStrategy {
    @Override
    public void distributeProducts() {
        System.out.println("Distributing products by bicycle...");
    }
}
