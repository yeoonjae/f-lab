package study.weeok09.templateCallbackPattern;

public class Soldier {

    void runContext(String weaponSound) {
        System.out.println("전투 시작");
        executeWeapon(weaponSound).runStrategy();
        System.out.println("전투 종료");
    }
    
    // 전략을 생성하는 코드가 Soldier 클래스 내부로 옮겨짐
    private Strategy executeWeapon(final String weaponSound) {
        return new Strategy() {
            @Override
            public void runStrategy() {
                System.out.println(weaponSound);
            }
        };
    }
}
