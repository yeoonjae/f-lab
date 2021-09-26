package study.week08;

public class CallByReference {

    public static void main(String[] args) {
        Animals ref_a = new Animals();
        Animals ref_b = ref_a;

        ref_a.age = 10;
        ref_b.age = 20;

        System.out.println(ref_a.age);
        System.out.println(ref_b.age);
    }
}

class Animals{
    public int age;
}
