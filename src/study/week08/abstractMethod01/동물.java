package study.week08.abstractMethod01;

public abstract class 동물 {

    abstract void 울어보세요();
}

class 고양이 extends 동물 {

    @Override
    void 울어보세요() {
        System.out.println("나는 고양이 야옹~ 야옹~");
    }
}

class 쥐 extends 동물 {

    @Override
    void 울어보세요() {
        System.out.println("나는 쥐 찍! 찍!");
    }
}

class 병아리 extends 동물 {

    @Override
    void 울어보세요() {
        System.out.println("나는 병아리 삐약! 삐약!");
    }
}

class 강아지 extends 동물 {

    @Override
    void 울어보세요() {
        System.out.println("나는 강아지 멍! 멍!");
    }
}

class 송아지 extends 동물 {

    @Override
    void 울어보세요() {
        System.out.println("나는 송아지 음메~ 음메~");
    }
}
