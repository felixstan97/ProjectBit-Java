package it.bit.gestionalecorsi.entities;

import java.time.LocalDateTime;
import java.util.List;

public class Lesson {

    private String subject;
    private LocalDateTime start;
    private LocalDateTime end;
    private Teacher teacher;
    private List<Presence> presences;
    private Classroom classroom;

}
