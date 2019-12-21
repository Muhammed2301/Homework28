package com.company;

public class Orukzar extends Village1 {
    public Orukzar(int population, int createdYear, double square, String nameManager, String name) {
        super(population, createdYear, square, nameManager, name);
    }

    @Override
    public void devise() {
        System.out.println("Orukzar rulit...");
    }

    @Override
    public void religion() {
        System.out.println("Islam");
    }

    @Override
    public void language() {
        System.out.println("Kyrgyz, english, uzbekish language");
    }

    @Override
    public void brandOfMessage() {
        System.out.println("Oruk, ");
    }

}
