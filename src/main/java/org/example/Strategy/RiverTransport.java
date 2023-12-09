package org.example.Strategy;

public class RiverTransport implements TransportStrategy {
    @Override
    public void distributeProducts() {
        System.out.println("Distributing products by river...");
    }
}
