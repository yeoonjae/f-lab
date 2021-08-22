package study.week02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        String[] arr = {"aaa","bbb","ccc"};
        List<String> strArr = Arrays.asList(arr);

        System.out.println(arr);

        Stream<String> stream = strArr.stream();
        Stream<String> stream2 = Arrays.stream(arr);

        stream.sorted().forEach(System.out::println);
        stream2.sorted().forEach(System.out::println);

    }
}
