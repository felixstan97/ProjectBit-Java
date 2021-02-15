package it.bit.gestionalecorsi.domain;

public class VirtualClassroom extends Classroom{

    private String piattaforma;
    private String link;
    private String password;

    @Override
    public boolean hasComputer() {
        return false;
    }

    @Override
    public boolean hasProjectors() {
        return false;
    }

    @Override
    public boolean hasComputerAndProjectors() {
        return false;
    }
}
