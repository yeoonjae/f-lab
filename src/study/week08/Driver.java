package study.week08;

public class Driver {

    public static void main(String[] args) {
        Penguin pororo = new Penguin();

        pororo.name = "뽀로로";
        pororo.habitat = "남극";

        pororo.showName();
        pororo.showName("초보람보");
        pororo.showHabitat();

        Animal pingu = new Penguin();

        pingu.name = "핑구";
        // pingu.habitat = "EBS";

        pingu.showName();
        // pingu.showHabitat();

        // Penguin happyfeet = new Animal();
    }
}
