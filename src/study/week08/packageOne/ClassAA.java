package study.week08.packageOne;

public class ClassAA extends ClassA {

    public static void main(String[] args) {
        ClassA a = new ClassA();
        // System.out.println(priSt); // 오류 : private은 본인 클래스 내에서만 접근 가능
        System.out.println(defSt);
        System.out.println(proSt);
        System.out.println(pubSt);

        a.runSomething();
        runStaticThing();
    }
}
