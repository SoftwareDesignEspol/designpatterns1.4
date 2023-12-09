package org.example.Strategy;

public class Transporter {
    private TransportStrategy transportStrategy;

    public Transporter() {}

    public Transporter(TransportStrategy transportStrategy) {
        this.transportStrategy = transportStrategy;
    }

    public void setTransportStrategy(TransportStrategy transportStrategy) {
        this.transportStrategy = transportStrategy;
    }

    public void transport() {
        transportStrategy.distributeProducts();
    }
}
