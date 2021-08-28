package study.week03;

public class CallByValue {

    private static void swap(int a, int b) {
        int temp = a;
        b = a;
        a = temp;
    }

    public static void main(String[] args) {
        // primitive type
        int a = 10;
        int b = 10;
        System.out.println(a == b);

        // reference type
        String A = new String("10");
        String B = new String("10");
        System.out.println(A == B);

        // primitive type 처럼 사용하는 reference type (constants pool)
        String AA = "10";
        String BB = "10";
        System.out.println(AA == BB);
    }
}
