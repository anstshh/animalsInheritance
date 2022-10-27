package Hierarchy;

import java.util.Objects;

public  class Predators extends Mammals {
    private String typeFood;

    public Predators(String name, String livingEnvironment, int speed, String typeFood) {
        super(name, livingEnvironment, speed);
        if (typeFood != null && !typeFood.isBlank()) {
            this.typeFood = typeFood;
        } else {
            this.typeFood = "No information";
        }
    }

    public Predators(String name, int age, String livingEnvironment, int speed, String typeFood) {
        super(name, age, livingEnvironment, speed);
        if (typeFood != null && !typeFood.isBlank()) {
            this.typeFood = typeFood;
        } else {
            this.typeFood = "No Information";
        }
    }

    public String getTypeFood() {
        return typeFood;
    }

    public void setTypeFood(String typeFood) {
        if (typeFood != null && !typeFood.isEmpty() && !typeFood.isBlank()) {
            this.typeFood = typeFood;
        } else {
            this.typeFood = "Meat";
        }
    }

    public void hunting() {
        System.out.println("I can hunt");
    }

    @Override
    public void eat() {
        System.out.println("I eat meat");
    }

    @Override
    public void go() {
        System.out.println("I can go");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predators predators = (Predators) o;
        return typeFood.equals(predators.typeFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeFood);
    }

    @Override
    public String toString() {
        return "Predators{" +
                "typeFood='" + typeFood + '\'' +
                '}';
    }
}