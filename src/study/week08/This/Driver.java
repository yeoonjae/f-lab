package study.week08.This;

class 사람{
    int age = 10;

    void test(){
        int age = 27;

        System.out.println("age : "+age);
        System.out.println("this.age : "+this.age);
    }
}
public class Driver {

    public static void main(String[] args) {
        사람 홍길동 = new 사람();
        홍길동.test();
    }
}
