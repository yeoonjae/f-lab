package study.weeok09.stream;

import java.util.stream.Stream;

public class MethodReferenceSample {

    public static void main(String[] args) {
        MethodReferenceSample sample = new MethodReferenceSample();
        String[] stringArray = {"학생A","학생B","학생C"};
        sample.staticReference(stringArray);
    }

    private static void printResult(String value) {
        System.out.println(value);
    }

    private void staticReference(String[] stringArray) {
        Stream.of(stringArray).forEach(MethodReferenceSample::printResult);
    }
}
