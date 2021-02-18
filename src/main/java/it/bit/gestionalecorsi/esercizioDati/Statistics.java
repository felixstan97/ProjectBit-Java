package it.bit.gestionalecorsi.esercizioDati;

import it.bit.gestionalecorsi.entities.Enrollment;
import it.bit.gestionalecorsi.entities.Gender;

import java.util.*;

public class Statistics {
    private List<Enrollment> listEnrol;

    public void setListEnrol(List<Enrollment> listEnrol) {
        this.listEnrol = listEnrol;
//        getNewestEnroll();
//        getOldestEnroll();
//        maxGrade();
//        minGrade();
//        avrGrade();
//        midGrade();
//        gradeMode();
//        areMaleGradeSup();
    }

    public Enrollment getOldestEnroll(){
        Enrollment oldest = listEnrol.get(0);
        for (Enrollment element : listEnrol) {
            if(oldest.getEnrollDate().isAfter(element.getEnrollDate())){
                oldest = element;
            }
        }
        return oldest;
    }

    public Enrollment getNewestEnroll(){

        Enrollment newest = listEnrol.get(0);
        for (Enrollment element : listEnrol) {
            if(newest.getEnrollDate().isBefore(element.getEnrollDate())){
                newest = element;
            }
        }
        return newest;
    }

    public double maxGrade(){

        Enrollment maxGrade = listEnrol.get(0);
        for(Enrollment element : listEnrol){
            if(maxGrade.getGrade() < element.getGrade()){
                maxGrade = element;
            }
        }
        return maxGrade.getGrade();
    }

    public double minGrade(){
        Enrollment minGrade = listEnrol.get(0);
        for(Enrollment element : listEnrol){
            if(minGrade.getGrade() > element.getGrade()){
                minGrade = element;
            }
        }
        return minGrade.getGrade();
    }

    public double avrGrade(){
        double sum = 0;
        for (Enrollment e : listEnrol) {
           sum += e.getGrade();
        }
        double media = sum/listEnrol.size();
        return media;
    }

//    0 1 0 = 2
//    1 0 1 = 5
//    0 0 1 = 1

    public double midGrade(){
        double risultato;
//        boolean haDimensionePari1 = listEnrol.size()%2 == 0;
        boolean haDimensionePari = (listEnrol.size() & 1) == 0;
        int posizioneCentraleMenoUno = listEnrol.size()/2 -1;
        int posizioneCentrale = listEnrol.size()/2 ;

        if(haDimensionePari){
            risultato = (listEnrol.get(posizioneCentraleMenoUno).getGrade()+listEnrol.get(posizioneCentrale).getGrade())/2;
        } else {
            risultato = listEnrol.get(posizioneCentrale).getGrade();
        }

        return risultato;
    }

    public double gradeMode(){
        Map<Double, Integer> gradeFrequency = new HashMap<>();
        double moda = 0;
        double grade;

        for (Enrollment e :listEnrol) {
            grade = e.getGrade();
            if(!gradeFrequency.containsKey(grade)){
                gradeFrequency.put(grade,1);
            }else {
                int val = gradeFrequency.get(grade) + 1;
                gradeFrequency.put(grade,val);
            }
        }
//        moda = gradeFrequency.entrySet().stream().sorted(
//                (kv1,kv2) -> kv2.getValue()-kv1.getValue()).findFirst().get().getKey();

//        moda = gradeFrequency.entrySet().stream()
//                .max(Comparator.comparingInt(Map.Entry::getValue)).get().getKey();

        moda = gradeFrequency.entrySet().stream()
                .max((kv1,kv2) -> kv1.getValue()-kv2.getValue()).get().getKey();

        return moda;

    }

    public boolean areMaleGradeSup(){
        double maxFGrade = 0;
        double minMGrade = Double.MAX_VALUE;

        for (Enrollment e : listEnrol) {
            if(e.getStudent().getGender() == Gender.MALE){
                if(e.getGrade() < minMGrade){
                    minMGrade =  e.getGrade();
                }
            } else if (e.getStudent().getGender() == Gender.FEMALE){
                if(e.getGrade() > maxFGrade){
                    maxFGrade = e.getGrade();
                }
            }
        }
        return minMGrade > maxFGrade;
    }

    public class ValueComparator implements Comparator<Map.Entry<Double,Integer>>{

        @Override
        public int compare(Map.Entry<Double, Integer> o1, Map.Entry<Double, Integer> o2) {
            return o2.getValue() - o1.getValue();
        }
    }

}

