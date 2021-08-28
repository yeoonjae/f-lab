package study.week04;

public class literal {

    public static void main(String[] args) {
//        // new String을 명시적으로 호출해서 인스턴스가 다른 메모리 위치에 있게 함
//        final String str1 = new String("100");
//        final String str2 = new String("100");
//
//        System.out.println(str1 == str2); // 동일성 체크
//        System.out.println(str1.equals(str2)); // 동등성 체크
//
//        MemberDto mdto = new MemberDto("yeonjae","010",22);
//        MemberDto mdto2 = new MemberDto("yeonjae","010",22);
//
//
//        System.out.println("mdto.equals(mdto2) : "+mdto.equals(mdto2));
//        System.out.println("mdto.hashCode() : "+mdto.hashCode());
//        System.out.println("mdto2.hashCode() : "+mdto2.hashCode());
//

        Person person1 = new Person(27, "Jaee");
        Person person2 = new Person(27, "Jaee");

        System.out.println("person1.equals(person2) : " + person1.equals(person2));
        System.out.println("person1.hashCode() : " + person1.hashCode());
        System.out.println("person2.hashCode() : " + person2.hashCode());




    }
}
