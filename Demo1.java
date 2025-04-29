interface Playable {
    public void play();
}

abstract class Instrument implements Playable {

    public void tune() {
        System.out.println("Instrument is being tuned.");
    }

    public abstract void repair();

}

final class Guitar extends Instrument {
    public void play() {
        System.out.println("Guitar is playing music.");
    }

    public void repair() {
        System.out.println("Repairing the Guitar.");
    }

}

public class Demo1{
    public static void main(String args[]){
    Guitar guitar = new Guitar();
    guitar.tune();
    guitar.play();
    guitar.repair();
}
}

