package study.week08.Super;

class 동물 {

    void method() {
        System.out.println("동물");
    }
}

class 조류 extends 동물 {

    @Override
    void method() {
        super.method();
        System.out.println("조류");

//        super.super.method();
    }
}

class 펭귄 extends 조류 {

    @Override
    void method() {
        super.method();
        System.out.println("펭귄");
    }
}

public class Driver {

    public static void main(String[] args) {
        펭귄 뽀로로 = new 펭귄();
        뽀로로.method();

    }
}
