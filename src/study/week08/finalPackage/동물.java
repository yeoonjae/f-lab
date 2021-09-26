package study.week08.finalPackage;

public class 동물 {

    final void 숨쉬다() {
        System.out.println("숨쉬는 중");
    }
}

class 포유류 extends 동물{
    // 에러 발생 : cannot override '숨쉬다()' in 'study.week08.finalPackage.동물'; overridden method is final
//    void 숨쉬다() {
//        System.out.println("숨쉬는 중");
//    }
}
