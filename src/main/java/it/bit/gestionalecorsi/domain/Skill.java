package it.bit.gestionalecorsi.domain;

public class Skill {
    private String materia;
    public enum LEVEL {BASE,INTERMEDIO,ESPERTO}
    private Skill.LEVEL level;

    public Skill(String materia, Skill.LEVEL level){
        this.materia = materia;
        this.level = level;
    }
}
