package study.weeok09.templatePattern;

public class Driver {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.playWithOwner();

        System.out.println();
        System.out.println();

        cat.runSomething();
    }
}
