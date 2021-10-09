package study.weeok09.strategyPattern;

public class StrategyBow implements Strategy{

    @Override
    public void runStrategy() {
        System.out.println("피슝~ , 활");
    }

}
