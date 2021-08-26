package study.week04;

import java.util.HashMap;

public class HashMapTest {

    public static void main(String[] args) {
        HashMapTest test = new HashMapTest();
        test.checkHashMap();

    }

    public void checkHashMap() {

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("A", "a");
        map.put("A", "s");
        System.out.println(map.get("A"));
        System.out.println(map.get("B"));
        System.out.println(map.get("A").toString());
    }
}
