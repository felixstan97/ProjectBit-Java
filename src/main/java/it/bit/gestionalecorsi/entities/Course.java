package it.bit.gestionalecorsi.entities;

import java.util.List;

public class Course {

    private long id;
    private String name;
    private int duration;
    private double cost;
    private String program;
    private boolean certification;
    private String category;
    private List<CourseEdition> editions;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
