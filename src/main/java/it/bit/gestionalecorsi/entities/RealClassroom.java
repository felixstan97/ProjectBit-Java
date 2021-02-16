package it.bit.gestionalecorsi.entities;

public class RealClassroom extends Classroom{

    public enum EQUIPMENT {PC, PROJECTOR, NOTHING, FULL}

    private EQUIPMENT tech;

    @Override
    public boolean hasComputer() {
        return tech == EQUIPMENT.PC || tech == EQUIPMENT.FULL;
    }

    @Override
    public boolean hasProjectors() {
        return tech == EQUIPMENT.PROJECTOR || tech == EQUIPMENT.FULL;
    }

}
