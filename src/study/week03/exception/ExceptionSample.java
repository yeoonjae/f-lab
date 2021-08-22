package study.week03.exception;

public class ExceptionSample {
    public static void main(String[] args) {
        ExceptionSample sample = new ExceptionSample();
        sample.arrayOutOfBoundsTryCatch();
    }

    public void arrayOutOfBoundsTryCatch(){
        int[] array = new int[5];
        try {
            System.out.println(array[5]);
            System.err.println("This code should run.");
        } catch (Exception e) {
            System.err.println("Exception occired.");
        }
        System.out.println("This code must run.");
    }
}
