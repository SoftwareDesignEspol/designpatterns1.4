package org.example.Chain;

public class ChainMain {
    public static void main(String[] args) {
        Attendant ad = new AsistenteDepartamento();
        Attendant dt = new DepartamentoTecnico();
        Attendant ji = new JefeInventario();
        Attendant gt = new GerenteTienda();

        ad.setNextAttendant(dt);
        dt.setNextAttendant(ji);
        ji.setNextAttendant(gt);

        ad.attend("Cambio de precio");
    }
}
