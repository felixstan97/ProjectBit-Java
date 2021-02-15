package it.bit.gestionalecorsi.domain;

public abstract class Classroom {
    private String name;
    private int capacity;


    public abstract boolean hasComputer();

    public abstract boolean hasProjectors();

    public abstract boolean hasComputerAndProjectors();
}
