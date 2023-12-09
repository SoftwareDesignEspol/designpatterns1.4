package org.example.Chain;

public abstract class Assistant implements Attendant{
    private Attendant next;

    @Override
    public void setNextAttendant(Attendant attendant) {
        this.next = attendant;
    }

    @Override
    public void attend(String request) {
        if (this.next != null) {
            this.next.attend(request);
        }
    }
}
