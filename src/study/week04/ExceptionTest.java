package study.week04;

public class ExceptionTest {

    public static void main(String[] args) {

        ExceptionTest test = new ExceptionTest();
        System.out.println("return : "+test.exceptionSample());
    }

    public String exceptionSample(){
        String str = "";
        try {
            str = "try 구문";
            System.out.println(str);
//            throw new Exception();
            return str;
        } catch (Exception e) {
            str = "catch 구문";
            System.out.println(str);
            return str;
        }finally{
            str = "finally 구문";
            System.out.println(str);
        }
    }

}
