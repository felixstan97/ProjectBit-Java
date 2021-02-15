package it.bit.gestionalecorsi.entities;

import java.time.LocalTime;

public class Session {

    public enum DAY_WEEK {LUNEDI, MARTEDI, MERCOLEDI, GIOVEDI, VENERDI, SABATO, DOMENICA}

    private DAY_WEEK day;
    private LocalTime start;
    private LocalTime end;
}
