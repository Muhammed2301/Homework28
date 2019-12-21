package com.company;

public class Jalalabad extends District {


    public Jalalabad(int population, int createdYear, double square, String nameManager, String name) {
        super(population, createdYear, square, nameManager, name);
    }

    @Override
    public void devise() {
        System.out.println("Jalal-Abad is younger's city  ");
    }

    @Override
    public void religion() {
        System.out.println("Islam, christian");
    }

    @Override
    public void language() {
        System.out.println("Kyrgyz language, russian language");
    }

    @Override
    public void brandOfMessage() {
        System.out.println("Nuts");
    }
}
