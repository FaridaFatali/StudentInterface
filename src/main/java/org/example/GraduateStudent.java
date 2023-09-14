package org.example;

import java.time.LocalDate;

public class GraduateStudent extends AbstractStudent {
    protected String advisor;
    protected String thesis;

    public GraduateStudent(int no, String nameSurname, int year, LocalDate dateOfBirth, String major, String advisor, String thesis) {
        super(no, nameSurname, year, dateOfBirth, major);
        this.advisor = advisor;
        this.thesis = thesis;
    }

    @Override
    public void study() {
        super.study();
    }

    @Override
    public void register() {
        System.out.println("Registered as a Graduate student.");
    }

    public void writeThesis() {
        System.out.println("The student is working on the thesis.");
    }

    public void meetWithAdvisor() {
        System.out.println("The student is meeting with the advisor.");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nThesis: " + thesis +
                "\nAdvisor: " + advisor;
    }

    @Override
    public String toStringRegister() {
        return super.toStringRegister();
    }
}
