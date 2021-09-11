package study.week05.thread;

public class RunThreads {

    public static void main(String[] args) {
        RunThreads threads = new RunThreads();
        threads.runBasic();
    }

    public void runBasic() {
        RunnableSample runnable = new RunnableSample();
        new Thread(runnable).start();

        ThreadSample thread = new ThreadSample();
        thread.start();

        System.out.println("두개의 스레드 실행 끝");
    }

}
