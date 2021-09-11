package study.week06;

public class SynchronizedSample {

    public static void main(String[] args) {
        Runnable run = new RunnableSample2();
        new Thread(run).start();
        new Thread(run).start();
    }

//    // 1. 메소드에 선언하여 메소드 전체를 임계영역으로 지정하는 방법
//    public synchronized void calcSum() {
//
//    }
//
//    // 2. 특정영역에 선언하여 특정영역만 임계영역으로 지정하는 방법
//    public void calc() {
//        synchronized (참조변수){ //임계영역
//        }
//    }

}

class Account {

    private int balance = 1000;

    public int getBalance() {
        return balance;
    }

//    // 1.메소드에 선언하여 메소드 전체를 임계영역으로 지정
//    public synchronized void withdraw(int money) {
//        if (balance >= money) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            balance -= money;
//        }
//    }
    // 2. 특정영역에 선언하여 특정영역만 임계영역으로 지정
    public void withdraw(int money) {
        synchronized (this){
            if (balance >= money) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                balance -= money;
            }
        }
    }

}
class RunnableSample2 implements Runnable {

    Account account = new Account();

    @Override
    public void run() {
        while (account.getBalance() > 0) {
            // 100,200,300 중의 한 값을 임의로 선택하여 출금
            int money = (int) (Math.random() * 3 + 1) * 100;
            account.withdraw(money);
            System.out.println("잔액 : "+ account.getBalance());
        }
    }
}
