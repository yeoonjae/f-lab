package study.week08.interface01;

interface Speakable {

    double PI = 3.14159;
    final double absoluteZeroPoint = -275.15;

    public abstract void sayYes();
}

class Specker implements Speakable {

    @Override
    public void sayYes() {
        System.out.println("I say NO!");
    }
}

public class Driver {

    public static void main(String[] args) {
        System.out.println(Speakable.absoluteZeroPoint);
        System.out.println(Speakable.PI);

        Specker reporter1 = new Specker();
        reporter1.sayYes();
    }

    public static void test(){
        // 에러 발생 : Cannot assign a value to final variable 'PI'
        // final이기 때문에 최종 변수 'PI'에 값을 할당할 수 없습니다. 라는 뜻이다.
//        Specker.PI = 3.14;

        // 에러 발생 : Cannot assign a value to final variable 'absoluteZeroPoint'
        // final이기 때문에 최종 변수 'absoluteZeroPoint'에 값을 할당할 수 없습니다. 라는 뜻이다.
//        Specker.absoluteZeroPoint = -275.0;
    }
}
