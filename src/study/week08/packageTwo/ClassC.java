package study.week08.packageTwo;

import study.week08.packageOne.ClassA;

public class ClassC {

    public static void main(String[] args) {
//        System.out.println(ClassA.priSt); // 오류 : private은 본인 클래스 내에서만 접근 가능
//        System.out.println(ClassA.defSt); // 오류 : 동일 패키지 내에서만 접근 가능
//        System.out.println(ClassA.proSt); // 오류 : 상속/같은 패키지 내의 클래스에서 접근 가능
        System.out.println(ClassA.pubSt);

//        ClassA.runSomething(); // 오류 : runSomething()메소드가 [default]이기 때문에 접근 불가
//        ClassA.runStaticThing(); // 오류 : runStaticThing()메소드가 [default]이기 때문에 접근 불가
    }
}
