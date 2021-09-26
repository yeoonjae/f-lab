package study.week07;

public class Driver {

    public static void main(String[] args) {
        날수있는 나는애1 = new 박쥐();
        나는애1.fly();

        날수있는 나는애2 = new 참새();
        나는애2.fly();

        헤엄칠수있는[] 맥주병들 = new 헤엄칠수있는[2];

        맥주병들[0] = new 고래();
        맥주병들[1] = new 펭귄();

        for (헤엄칠수있는 맥주병 : 맥주병들) {
            맥주병.swim();
        }
    }
}
