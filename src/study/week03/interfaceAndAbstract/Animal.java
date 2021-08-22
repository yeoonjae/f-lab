package study.week03.interfaceAndAbstract;

public abstract class Animal {  // 추상 클래스
    public abstract void sound(); // 추상 메소드

    public void eat() // 일반 메소드
    {
        System.out.println("추상메소드 안에 일반 메소드");
    }

}
