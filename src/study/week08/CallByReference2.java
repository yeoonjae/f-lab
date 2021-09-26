package study.week08;

public class CallByReference2 {

    public static void main(String[] args) {
        Animals ref_a = new Animals();
        Animals ref_b = ref_a;

        System.out.println(ref_a);  // study.week08.Animals@1b6d3586 - 실행할 때마다 다르다.
        System.out.println(ref_b);  // 바로 위와 같은 값이 출력된다.


    }
}
