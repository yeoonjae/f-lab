package study.week03.interfaceAndAbstract;

public class Rabbit implements AnimalInterface{
    @Override
    public void sound() {
        System.out.println("토끼의 울음소리");
    }

    @Override
    public void eat() {
        AnimalInterface.super.eat();
    }
}
