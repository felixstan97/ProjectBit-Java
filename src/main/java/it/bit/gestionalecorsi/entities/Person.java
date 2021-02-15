package it.bit.gestionalecorsi.entities;

import it.bit.gestionalecorsi.entities.Address;
import it.bit.gestionalecorsi.entities.Skill;

import java.util.List;

public abstract class Person {

    private long id;
    private String firstName;
    private String lastName;
    private String sex;
    private String birthDate;
    private String birthPlace;
    private String fiscalCode;
    private Address address;
    private String email;
    private String phone;

    private List<Skill> skills;


}
