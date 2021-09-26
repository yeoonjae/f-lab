package study.week08.packageOne;

public class ClassA {

    // 객체 멤버와 접근 제어자
//    private String pri = "private";
//    String def = "default";
//    protected String pro = "protected";
//    public String pub = "public";

    // 정적 멤버와 접근 제어자
    private static String priSt = "private";
    static String defSt = "default";
    protected static String proSt = "protected";
    public static String pubSt = "public";


    void runSomething() {
        System.out.println("RunSomething Method");
    }

    static void runStaticThing() {
        System.out.println("RunStaticThing Method");
    }

    public static void main(String[] args) {
        System.out.println(priSt);
        System.out.println(defSt);
        System.out.println(proSt);
        System.out.println(pubSt);

        ClassA a = new ClassA();
        a.runSomething();
        runStaticThing();
    }

}
