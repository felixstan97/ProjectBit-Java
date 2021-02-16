package it.bit.gestionalecorsi.entities;

import java.time.LocalDateTime;
import java.util.List;

public class CourseEdition {

   private long id;
   private LocalDateTime startDate;
   private Classroom classroom;     // aula in cui si svolge il corso
   private List<Person> students;   // elenco partecipanti
   private String editionId;
   private List<Module> modules;
   private List<Session> sessions;  // quando dovrebbero sostenersi le lezioni
   private Employee responsible;
   private Course course;

}
