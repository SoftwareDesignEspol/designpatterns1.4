package org.example.Chain;

public class DepartamentoTecnico extends Assistant {
    @Override
    public void attend(String request) {
        System.out.println("Departamento técnico: " + request);
        super.attend(request);
    }
}
