package Hierarchy;

import java.util.Objects;

public class Birds extends Animals {
    private  String livingEnvironment;
    private NonFlying nonFlying;
    private Flying flying;

    public Birds(String name, String livingEnvironment) {
        super(name);
        if (livingEnvironment != null && !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        }else{
            this.livingEnvironment = "No information";
        }
    }

    public Birds(String name, int age, String livingEnvironment) {
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

    public void hunt() {
        System.out.println("I hunt for insects");
    }

    @Override
    public void eat() {
        System.out.println("I eat insects");
    }

    @Override
    public void go() {
        System.out.println("I can`t go, but can fly");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Birds birds = (Birds) o;
        return livingEnvironment.equals(birds.livingEnvironment) && nonFlying.equals(birds.nonFlying) && flying.equals(birds.flying);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment, nonFlying, flying);
    }

    @Override
    public String toString() {
        return "Birds{" +
                "flightless=" + nonFlying +
                ", flying=" + flying +
                '}';
    }
}