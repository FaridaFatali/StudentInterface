package org.example;

import java.time.LocalDate;

public class UndergraduateStudent extends AbstractStudent {
    protected String minor;

    public UndergraduateStudent(int no, String nameSurname, int year, LocalDate dateOfBirth, String major, String minor) {
        super(no, nameSurname, year, dateOfBirth, major);
        this.minor = minor;
    }

    @Override
    public void study() {
        super.study();
    }

    @Override
    public void register() {
        System.out.println("Registered as an Undergraduate student.");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nMinor: " + minor;
    }

    @Override
    public String toStringRegister() {
        return super.toStringRegister();
    }
}
