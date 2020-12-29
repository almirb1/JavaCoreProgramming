package OsmoPredavanje;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
        System.out.println("Poziva se konstruktor dog klase.");
    }

    @Override
    public void playSound() {
        System.out.println("Aw, aw...");
    }
}
