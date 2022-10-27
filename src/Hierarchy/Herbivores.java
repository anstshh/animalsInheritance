package Hierarchy;

import java.util.Objects;

public class Herbivores extends Mammals {
    private String typeFood;

    public Herbivores(String name,int age,  String livingEnvironment, int speed, String typeFood) {
        super(name, age, livingEnvironment, speed);
        if (typeFood != null && !typeFood.isBlank()) {
            this.typeFood = typeFood;
        } else {
            this.typeFood = "No information";
        }
    }

    public Herbivores(String name, String livingEnvironment, int speed, String typeFood) {
        super(name, livingEnvironment, speed);
        if (typeFood != null  && !typeFood.isBlank()) {
            this.typeFood = typeFood;
        } else {
            this.typeFood = "No information";
        }
    }

    public String getTypeFood() {
        return typeFood;
    }

    public void setTypeFood(String typeFood) {
        if (typeFood != null && !typeFood.isBlank()) {
            this.typeFood = typeFood;
        } else {
            this.typeFood = "Grass and herbs";
        }
    }

    public void graze() {
        System.out.println("I can graze in the field");
    }

    @Override
    public void eat() {
        System.out.println("I eat grass");
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
        Herbivores that = (Herbivores) o;
        return typeFood.equals(that.typeFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeFood);
    }

    @Override
    public String toString() {
        return "Herbivores{" +
                "typeFood='" + typeFood + '\'' +
                '}';
    }
}