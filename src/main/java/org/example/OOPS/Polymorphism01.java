package org.example.OOPS;

class Animal {
    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Lion extends Animal {
    @Override
    public void sleep() {
        System.out.println("lion is sleeping");
    }

}

class Elephant extends Animal {
    @Override
    public void sleep() {
        System.out.println("elephant is sleeping");
    }

}

public class Polymorphism01 {
    public static void main(String[] args) {
        Animal a1= new Elephant();
        animalSlepping(a1);
        a1= new Lion();
        animalSlepping(a1);
    }

    public static void animalSlepping(Animal  animal) {
        animal.sleep();
    }
}
