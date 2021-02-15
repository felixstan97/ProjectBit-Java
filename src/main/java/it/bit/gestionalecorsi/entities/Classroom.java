package it.bit.gestionalecorsi.entities;

public abstract class Classroom {
    private long id;
    private String name;
    private String title;
    private int size;

    public abstract boolean hasComputer();

    public abstract boolean hasProjectors();

}
