package study.weeok09.strategyPattern;

public class StrategyGun implements Strategy{

    @Override
    public void runStrategy() {
        System.out.println("탕! 탕!");
    }
}
