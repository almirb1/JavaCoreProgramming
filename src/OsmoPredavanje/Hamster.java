package OsmoPredavanje;

public class Hamster extends Animal {
    private String name;

    public Hamster(String name){
        super(name);
        System.out.println("Poziva se konstruktor Hamster klase.");
    }

    @Override
    public void playSound() {
        System.out.println("Hr, hr...");
    }
}
