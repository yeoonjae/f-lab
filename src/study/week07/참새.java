package study.week07;

public class 참새 extends 조류 implements 날수있는{
    참새(){
        myClass = "조류";
    }


    @Override
    public void fly() {
        System.out.println(myClass + " 나는 중 ~ 슈웅~~!!~");
    }
}
