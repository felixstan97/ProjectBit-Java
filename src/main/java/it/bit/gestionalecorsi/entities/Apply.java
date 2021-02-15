package it.bit.gestionalecorsi.entities;

import java.time.LocalDateTime;

public class Apply {

    public enum State {RECEIVED, EVALUATING, REJECTED, APPROVED}

    private CourseEdition edition;
    private Student student;
    private LocalDateTime applyDate;
    private State applyState;
    private String comments;
}
