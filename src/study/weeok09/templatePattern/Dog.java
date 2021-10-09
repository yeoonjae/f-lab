package study.weeok09.templatePattern;

public class Dog extends Animal{

    @Override
    void play() {
        System.out.println("멍! 멍!");
    }

    void runSomething(){
        System.out.println("멍~ 꼬리 살랑!");
    }
}
