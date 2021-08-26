package study.week04;

public class StringMethod {

  public static void main(String[] args) {
    // == 연산자는 메모리 상 주소가 같은지를 비교
    // literal로 선언한 경우 constant pool에 저장이 되서 동일한 값을 갖는 객체가 있으면 이미 만든 객체를 재사용
    String str = "Check String";
    String str2 = "Check String";

    if (str == str2) {
      System.out.println("str == str2 result is same.");
    } else {
      System.out.println("str == str2 result is different.");
    }

    if (str.equals(str2)) {
      System.out.println("str.equals(str2) result is same");
    }

    String str3 = "check string";
    if (str.equalsIgnoreCase(str3)) {
      System.out.println("str.equalsIgnoreCase(str3) result is same");
    }

  }
}
