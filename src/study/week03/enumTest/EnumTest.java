package study.week03.enumTest;

public class EnumTest {
    public static void main(String[] args) {
        OverTimeValue value = OverTimeValue.FIVE_HOUR;
        System.out.println(value);

        OverTimeValue[] valueList = OverTimeValue.values();
        for (OverTimeValue value2 : valueList) {
            System.out.println(value2);
            System.out.println(value2.getAmount());
        }

//        System.out.println(value.getAmount());


    }
}
