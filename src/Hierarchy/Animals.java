package Hierarchy;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Animals {

    private String name;
    private int age;

    public Animals (String name) {
        this(name,0);
    }

    public Animals (String name, int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            this.age = Math.abs(age);
        }
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank()) {
            this.name = name;
        }else{
            this.name = "Animal";
        }
    }

    public int getAge() {
        return  age;
    }

    public abstract void eat();

    public void sleep(){
        System.out.println("Deep sleep");
    }
    public abstract void go ();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age && name.equals(animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}