package OsmoPredavanje;

public class Cat extends Animal{


    public Cat(String name){
        super(name);
        System.out.println("Poziva se konstruktor Cat klase.");

    }

    @Override
    public void playSound() {
        System.out.println("Meow, meow...");
    }
}
