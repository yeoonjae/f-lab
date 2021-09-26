package study.week07;

public class 펭귄 extends 조류 implements 헤엄칠수있는{
    펭귄(){
        myClass = "펭귄";
    }

    @Override
    public void swim() {
        System.out.println(myClass + " 수영 중~ 펭귄펭귄 쉉쉉 ");
    }
}
