package study.week04;

public class ImmutablePhone {

    private final Iphone iphone;

    public ImmutablePhone(final Iphone iphone) {
        this.iphone = iphone;
    }

    public Iphone getIphone(){
        return iphone;
    }

}

class Iphone {

    private int version;

    public Iphone(int version) {
        this.version = version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getVersion(){
        return version;
    }
}