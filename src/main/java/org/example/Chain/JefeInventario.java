package org.example.Chain;

public class JefeInventario extends Assistant{
    @Override
    public void attend(String request) {
        System.out.println("Jefe de inventario: " + request);
        super.attend(request);
    }
}
