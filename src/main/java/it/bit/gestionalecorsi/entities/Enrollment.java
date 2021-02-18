package it.bit.gestionalecorsi.entities;

import java.time.LocalDate;

/*
bisogna leggere da file csv
ciccio,pasticcio,m,20/02/2021,1,Java For Dummies,true,7.5
7.5: grade
true: corso pagato
java for dummies: titolo corso
1: id course edition

- leggere da file, instanziare oggetti Enrollment, stampare rapporto
- qual è l'iscrizione più recente fatta?
- qual è l'iscrizione più antica fatta?
- massimo voto registrato e il minimo
- valor medio dei voti
- mediana dei voti (valore nel mezzo di un elenco ordinato) (nel caso di numero di elementi pari bisogna fare la media dei due elementi centrali)
- moda dei voti ( voto più frequente)
- verificare che sia vero che il minimo voto dei maschi è superiore al massimo voto delle femmine


 */

public class Enrollment implements Comparable<Enrollment>{

    private Student student;
    private CourseEdition courseEdition;
    private LocalDate enrollDate;
    private Boolean isPayed;
    private double grade;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public CourseEdition getCourseEdition() {
        return courseEdition;
    }

    public void setCourseEdition(CourseEdition courseEdition) {
        this.courseEdition = courseEdition;
    }

    public LocalDate getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(LocalDate enrollDate) {
        this.enrollDate = enrollDate;
    }

    public Boolean getPayed() {
        return isPayed;
    }

    public void setPayed(Boolean payed) {
        isPayed = payed;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public int compareTo(Enrollment o) {

        if(this.enrollDate.isAfter(o.enrollDate)){
            return +1;
        }

        if(this.enrollDate.isBefore(o.enrollDate)){
            return -1;
        }

        return 0;
    }
}
