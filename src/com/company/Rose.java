package com.company;

public class Rose extends Flower implements Flowerable, FlowerDetal {
    @Override
    public void bloom() {
        System.out.println("bloom");
    }

    @Override
    public void wilt() {
        System.out.println("wilt");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Rose{}";
    }

    public Rose() {
    }

    public void printQuantityOfPetals() {
        Petal petal = new Petal();
        System.out.println(petal.getQuantityOfPetals());
    }
}
