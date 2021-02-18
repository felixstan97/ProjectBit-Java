package it.bit.gestionalecorsi.esercizioDati;

import it.bit.gestionalecorsi.entities.Enrollment;

import java.io.IOException;
import java.nio.file.Path;

public class Startup {
    public static void main(String[] args) {

        CsvParser parser = new CsvParser(Path.of("iscrizioni.csv"));
        Statistics statistics = new Statistics();
        Controller controller = new Controller(parser, statistics);
        controller.showStatistics();


//        Iterable<Enrollment> le = new ArrayList<>();
//
//        for (Enrollment e : le){
//            System.out.println(e);
//        }
//        for (Iterator<Enrollment> it = le.iterator(); it.hasNext();){
//
//            Enrollment e = it.next();
//            System.out.println(e);
//        }
//        Iterable lee = new ArrayList<>();
//
//        for (Object o : lee){
//            System.out.println(o);
//        }
//        for (Iterator it = lee.iterator(); it.hasNext();){
//
//            Object o = it.next();
//            Enrollment e = (Enrollment) o;
//            System.out.println(e);
//        }
    }
}
