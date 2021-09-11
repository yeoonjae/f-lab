package study.week04;

import java.util.concurrent.ConcurrentHashMap;

public class CheckCompareTo {

  public static void main(String[] args) {
    String str1 = "a";
    String str2 = "b";
    String str3 = "c";
    System.out.println(str2.compareTo(str1));
    System.out.println(str2.compareTo(str3));
    System.out.println(str1.compareTo(str3));
  }


}
