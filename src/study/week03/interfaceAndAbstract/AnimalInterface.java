package study.week03.interfaceAndAbstract;

public interface AnimalInterface {
    public void sound();
    public default void eat(){
        System.out.println("인터페이스 내 default 메소드");
    }
}
