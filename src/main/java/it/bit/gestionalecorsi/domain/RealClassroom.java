package it.bit.gestionalecorsi.domain;

public class RealClassroom extends Classroom{
    private String titolo;
    private String tecnologia;

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
