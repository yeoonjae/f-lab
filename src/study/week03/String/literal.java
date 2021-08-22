package study.week03.String;

public class literal {
    public static void main(String[] args) {
        // new String을 명시적으로 호출해서 인스턴스가 다른 메모리 위치에 있게 함
        final String str1 = new String("100");
        final String str2 = new String("100");

        System.out.println(str1 == str2); // 동일성 체크
        System.out.println(str1.equals(str2)); // 동등성 체크

        final Integer int1 = Integer.valueOf(str1);
        final Integer int2 = Integer.valueOf(str2);

        System.out.println(int1 == int2);
    }
}
