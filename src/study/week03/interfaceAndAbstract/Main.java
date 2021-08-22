package study.week03.interfaceAndAbstract;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.sound();
        cat.eat();

        dog.sound();
        dog.eat();
    }
}
