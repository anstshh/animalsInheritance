package Hierarchy;

import java.util.Objects;

public class Amphibians extends Animals {

    private String livingEnvironment;

    public Amphibians(String name, String livingEnvironment) {
        super(name);
        if (livingEnvironment != null&& !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        }else{
            this.livingEnvironment = "No information";
        }
    }

    public Amphibians(String name, int age, String livingEnvironment) {
        super(name, age);
        if (livingEnvironment != null && !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        }else{
            this.livingEnvironment = "No information";
        }
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void hunt(){
        System.out.println("I hunt for insects");
    }

    @Override
    public void eat() {
        System.out.println("I eat insects");
    }

    @Override
    public void go() {
        System.out.println("I go slowly");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibians that = (Amphibians) o;
        return livingEnvironment.equals(that.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }

    @Override
    public String toString() {
        return "Amphibians{" +
                "livingEnvironment='" + livingEnvironment + '\'' +
                '}';
    }
}