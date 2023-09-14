package org.example;

import java.time.LocalDate;

public class VocationalStudent extends AbstractStudent{

    public VocationalStudent(int no, String nameSurname, int year, LocalDate dateOfBirth, String major) {
        super(no, nameSurname, year, dateOfBirth, major);
    }

    @Override
    public void study() {
        super.study();
    }

    @Override
    public void register() {
        System.out.println("Registered as a Vocational student.");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String toStringRegister() {
        return super.toStringRegister();
    }
}
