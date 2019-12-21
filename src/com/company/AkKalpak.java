package com.company;

public class AkKalpak extends Village1 {
    public AkKalpak(int population, int createdYear, double square, String nameManager, String name) {
        super(population, createdYear, square, nameManager, name);
    }

    @Override
    public void devise() {
        System.out.println("Asmandan jaryk korson jyldyz dep bil, Ak-Kalpak kiygendi Ak-Kalpaktan eken dep bil !!! ");
    }

    @Override
    public void religion() {
        System.out.println("Islam");
    }

    @Override
    public void language() {
        System.out.println("russian, kyrgyz etc");
    }

    @Override
    public void brandOfMessage() {
        System.out.println("Ak-Kalpak");
    }
}
