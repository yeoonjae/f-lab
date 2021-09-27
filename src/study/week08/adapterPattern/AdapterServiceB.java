package study.week08.adapterPattern;

public class AdapterServiceB {

    ServiceB sa1 = new ServiceB();

    void runService() {
        sa1.runServiceB();
    }
}
