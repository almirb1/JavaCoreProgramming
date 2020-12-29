package OsmoPredavanje;

public abstract class Animal {
    private String name;

    public Animal(String param) {
        System.out.println("Poziva se konstruktor animal klase.");
        this.name = param;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public  abstract void playSound();
}
