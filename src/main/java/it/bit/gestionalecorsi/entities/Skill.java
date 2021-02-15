package it.bit.gestionalecorsi.entities;

public class Skill {

    public enum LEVEL {BASE, INTERMEDIO, ESPERTO, GURU}

    private Ability ability;
    private Skill.LEVEL level;
    private boolean certified;
    private Person person;

}
