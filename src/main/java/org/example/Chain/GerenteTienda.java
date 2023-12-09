package org.example.Chain;

public class GerenteTienda extends Assistant{

    @Override
    public void attend(String request) {
        System.out.println("Gerente de tienda atendiendo solicitud: " + request);
        super.attend(request);
    }
}
