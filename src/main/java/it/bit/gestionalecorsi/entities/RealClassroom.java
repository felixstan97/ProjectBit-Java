package it.bit.gestionalecorsi.entities;

public class RealClassroom extends Classroom{

    public enum EQUIPMENTS {PC, PROJECTOR, NOTHING, FULL}

    private EQUIPMENTS tech;

    @Override
    public boolean hasComputer() {
        return tech == EQUIPMENTS.PC || tech == EQUIPMENTS.FULL;
    }

    @Override
    public boolean hasProjectors() {
        return tech == EQUIPMENTS.PROJECTOR || tech == EQUIPMENTS.FULL;
    }

}
