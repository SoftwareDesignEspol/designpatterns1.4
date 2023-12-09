package org.example.Chain;

public class AsistenteDepartamento extends Assistant {

    @Override
    public void attend(String request) {
        System.out.println("Asistente de departamento: " + request);
        super.attend(request);
    }
}
