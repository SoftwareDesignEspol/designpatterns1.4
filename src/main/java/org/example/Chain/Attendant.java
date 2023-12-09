package org.example.Chain;

public interface Attendant {
    public void setNextAttendant(Attendant attendant);

    public void attend(String request);
}
