package OsmoPredavanje;

public class Profesor extends  Person{
    private double salary;

    public Profesor() {
        System.out.println("Poziva se konstruktor profesor klase.");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
