package Hierarchy;

public class Main {
    public static void main(String[] args) {

        Herbivores zebra = new Herbivores("Zebra",5 ,"Savanna", 50,"grass");
        printHerbivores(zebra);
        zebra.walk();
        zebra.eat();
        zebra.go();
        zebra.graze();
        Herbivores elephant = new Herbivores("Elephant", 2, "Africa", 10,"Grass");
        Herbivores donkey = new Herbivores("Donkey", 15, "Asia", 150,"Grass");

        System.out.println();

        Predators lion = new Predators("Lion", 10, "Africa", 30, "meat");
        Predators tiger = new Predators("Tiger", 6, "Africa", 130, "meat");
        Predators bear = new Predators("Bear", 16, "Russia", 80, "meat, honey, and berries");
        printPredators(bear);
        bear.walk();
        bear.eat();
        bear.go();
        bear.hunting();

        System.out.println();

        Amphibians snake = new Amphibians("Snake", 1, "Canada");
        Amphibians lizard = new Amphibians("Lizard", 3, "Asia");
        printAmphibians(lizard);
        lizard.eat();
        lizard.go();
        lizard.hunt();

        System.out.println();

        NonFlying peacock = new NonFlying("Peacock", 4, "Asia", "non flying");
        NonFlying chicken = new NonFlying("Chicken", 14, "Russia", "non flying");
        NonFlying pinguin = new NonFlying("Pinguin", 12, "Antarctica", "non flying");
        printFlightless(peacock);
        peacock.eat();
        peacock.go();
        peacock.walk();

        System.out.println();

        Flying eagle = new Flying("Eagle", 5, "Asia", "flying");
        Flying raven = new Flying("Raven", 15, "Russia", "flying");
        Flying parrot = new Flying("Parrot", 3, "China", "flying");
        printFlying(parrot);
        parrot.eat();
        parrot.go();
        parrot.fly();

    }

    public static void printHerbivores(Herbivores herbivores) {
        System.out.println("Наименование " + herbivores.getName() +
                ", Возраст " + herbivores.getAge() + " лет. " +
                ", Среда обитания " + herbivores.getLivingEnvironment() +
                ", Скорость " + herbivores.getSpeed() + " км/ч. " +
                ", к какому классу относится - " + herbivores.getClass());
    }

    public static void printPredators(Predators predators) {
        System.out.println("Наименование " + predators.getName() +
                ", Возраст " + predators.getAge() + " лет. " +
                ", Среда обитания " + predators.getLivingEnvironment() +
                ", Скорость " + predators.getSpeed() + " км/ч. " +
                ", чем питается " + predators.getTypeFood() +
                ", к какому классу относится - " + predators.getClass());
    }

    public static void printAmphibians(Amphibians amphibians) {
        System.out.println("Наименование " + amphibians.getName() +
                ", Возраст " + amphibians.getAge() + " лет. " +
                ", Среда обитания " + amphibians.getLivingEnvironment() +
                ", к какому классу относится - " + amphibians.getClass());
    }

    public static void printFlightless(NonFlying flightless){
        System.out.println("Наименование " + flightless.getName() +
                ", Возраст " + flightless.getAge() + " лет. " +
                ", Среда обитания " + flightless.getLivingEnvironment() +
                ", Тип движения "+ flightless.getTypeOfMovement()+
                ", к какому классу относится - " + flightless.getClass());
    }

    public static void printFlying(Flying flying){
        System.out.println("Наименование " + flying.getName() +
                ", Возраст " + flying.getAge() + " лет. " +
                ", Среда обитания " + flying.getLivingEnvironment() +
                ", Тип движения "+ flying.getTypeOfMovement()+
                ", к какому классу относится - " + flying.getClass());
    }
}