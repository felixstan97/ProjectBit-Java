package it.bit.gestionalecorsi.entities;

public class VirtualClassroom extends Classroom{

    private String platform;
    private String link;
    private String password;

    @Override
    public boolean hasComputer() {
        return true;
    }

    @Override
    public boolean hasProjectors() {
        return true;
    }

}
