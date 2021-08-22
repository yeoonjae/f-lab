package study.week03.enumTest;

public enum OverTimeValue {
    THREE_HOUR(18000),
    FIVE_HOUR(30000),
    WEEKEND_FOUR_HOUR(40000),
    WEEKEND_EIGHT_HOUR(60000);
    private final int amount;

    OverTimeValue(int amount) {
        this.amount = amount;
    }
    public int getAmount(){
        return amount;
    }

}
