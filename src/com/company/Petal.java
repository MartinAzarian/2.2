package com.company;

public class Petal implements FlowerDetal {
    int quantityOfPetals = 0;

    @Override
    public String toString() {
        return "Petal{" +
                "quantityOfPetals=" + quantityOfPetals +
                '}';
    }

    public Petal() {
    }

    public Petal(int quantityOfPetals) {
        this.quantityOfPetals = quantityOfPetals;
    }

    public int getQuantityOfPetals() {
        return quantityOfPetals;
    }

    public void setQuantityOfPetals(int quantityOfPetals) {
        this.quantityOfPetals = quantityOfPetals;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Petal petal = (Petal) o;

        return quantityOfPetals == petal.quantityOfPetals;
    }

    @Override
    public int hashCode() {
        return quantityOfPetals;
    }
}
