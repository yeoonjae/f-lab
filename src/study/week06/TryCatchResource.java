package study.week06;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchResource{

    public static  void main(String[] args) {
        try (
            FileInputStream fis = new FileInputStream("score.dat");
            DataInputStream dis = new DataInputStream(fis))
        {
            System.out.println("try-with-resource 적용");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
