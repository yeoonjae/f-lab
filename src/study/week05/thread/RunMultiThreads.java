package study.week05.thread;

public class RunMultiThreads {

    public static void main(String[] args) {
        RunMultiThreads threads = new RunMultiThreads();
        threads.runMultiThreads();
    }

    public void runMultiThreads(){
        RunnableSample[] runSample = new RunnableSample[5];
        ThreadSample[] threadSample = new ThreadSample[5];

        for (int i = 0; i < 5; i++) {

            runSample[i] = new RunnableSample();
            threadSample[i] = new ThreadSample();

            new Thread(runSample[i]).start();
            threadSample[i].start();
        }
        
        System.out.println("반복문 종료");
    }
}
