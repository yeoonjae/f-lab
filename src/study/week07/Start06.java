package study.week07;

public class Start06 extends Thread{

    static int share;

    public static void main(String[] args) {
        Start06 t1 = new Start06();
        Start06 t2 = new Start06();

        t1.start();
        t2.start();
    }

    public void run(){
        for (int count = 0; count < 10; count++) {
            System.out.println(share++);

            try {
                sleep(1000);
            }catch(InterruptedException e){

            }
        }
    }
}
