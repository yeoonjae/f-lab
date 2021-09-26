package study.week08.packageOne;

public class ClassB {

    public static void main(String[] args) {
        ClassA a = new ClassA();
        // System.out.println(ClassA.priSt); -- 오류
        System.out.println(ClassA.defSt);
        System.out.println(ClassA.proSt);
        System.out.println(ClassA.pubSt);

        a.runSomething();
        ClassA.runStaticThing();
    }
}
