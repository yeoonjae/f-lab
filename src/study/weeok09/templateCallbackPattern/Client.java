package study.weeok09.templateCallbackPattern;


public class Client {

    public static void main(String[] args) {
        Soldier rambo = new Soldier();

        rambo.runContext("총 탕탕 총총");

        System.out.println();

        rambo.runContext("칼! 칼 스윽");

        System.out.println();

        rambo.runContext("도끼 도독 퍽");
    }
}
