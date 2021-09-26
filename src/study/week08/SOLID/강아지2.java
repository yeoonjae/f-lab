package study.week08.SOLID;

public abstract class 강아지2 {

    abstract void 배변활동();
}

class 암컷강아지 extends 강아지2 {

    @Override
    void 배변활동() {
        // 앉은 자세로 소변
    }
}

class 수컷강아지 extends 강아지2 {

    @Override
    void 배변활동() {
        // 한 쪽 다리를 들고 소변
    }
}
