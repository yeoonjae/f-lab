package study.week04;

import java.util.ArrayList;
import java.util.List;

public class ImmutableTest {

    public static void main(String[] args) {
//        Iphone iphone = new Iphone(10);
//        ImmutablePhone phone = new ImmutablePhone(iphone);
//
//        System.out.println(phone.getIphone().getVersion()); // 10
//
//        phone.getIphone().setVersion(14);
//        System.out.println(phone.getIphone().getVersion()); // 14

        List<ImmutablePhone> immutablePhone = new ArrayList<>();
        immutablePhone.add(new ImmutablePhone(new Iphone(3)));
        immutablePhone.add(new ImmutablePhone(new Iphone(4)));

        ListObject listObject = new ListObject(immutablePhone);

        for(ImmutablePhone list : listObject.getPhone()){
            System.out.println(list.getIphone().getVersion());
        }

        immutablePhone.add(new ImmutablePhone(new Iphone(5)));
        immutablePhone.add(new ImmutablePhone(new Iphone(6)));

        for(ImmutablePhone list : listObject.getPhone()){
            System.out.println(list.getIphone().getVersion());
        }


    }

}
