package it.bit.gestionalecorsi.esercizioDati;

import it.bit.gestionalecorsi.entities.Enrollment;

import java.io.IOException;
import java.util.List;

public class Controller {

    private CsvParser parser;
    private Statistics statistics;

    public Controller(CsvParser parser,Statistics statistics){
        this.parser = parser;
        this.statistics = statistics;
    }

    public void showStatistics(){
        try {
            Iterable<Enrollment> enrollments = parser.read();
            if(enrollments instanceof List){
                List<Enrollment> listEnr = (List<Enrollment>) enrollments;
                statistics.setListEnrol(listEnr);
                showRecentEnrollment();
                showOldestEnrollment();
                showMaxGrade();
                showMinGrade();
                showAvrGrade();
                showMidGrade();
                showModeGrade();
                showIlFalso();
            } else {
                System.out.println("La sorgente dei dati non e una lista");
            }

        }  catch (IOException e) {
            e.printStackTrace();
        }

        //prende i dati dal parser li passa a statistics
        //chiede a statistcs i dati che ci interessano
        //stampa i dati
    }

    public void showRecentEnrollment(){
        System.out.printf("L' iscrizione piu recente e di : %s%n" , statistics.getNewestEnroll().getEnrollDate());
    }
    public void showOldestEnrollment(){
        System.out.printf("L' iscrizione piu antica e di : %s%n" , statistics.getOldestEnroll().getEnrollDate());
    }
    public void showMaxGrade(){
        System.out.printf("Il voto piu alto e : %.2f%n" , statistics.maxGrade());
    }
    public void showMinGrade(){
        System.out.printf("Il voto piu basso e : %.2f%n" , statistics.minGrade());
    }
    public void showAvrGrade(){
        System.out.printf("Il voto medio e : %.2f%n" , statistics.avrGrade());
    }
    public void showMidGrade(){
        System.out.printf("La mediana e : %.2f%n" , statistics.midGrade());
    }
    public void showModeGrade(){
        System.out.printf("La moda dei voti e : %.2f%n" , statistics.gradeMode());
    }
    public void showIlFalso(){
        System.out.printf("Le cose vanno come NON dovrebbero andare : %s%n" , statistics.areMaleGradeSup());
    }

}
