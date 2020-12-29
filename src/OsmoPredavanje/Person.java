package OsmoPredavanje;

import DevetoPredavanje.Enumareted.Gender;

public class Person {

    private  String name;
    private String surname;
    private int age;
    private  Gender gender;
    private Animal animal;


    public Person() {
        System.out.println("Poziva se konstruktor klase Person.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null){
            this.name = name;
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if(surname != null){
            this.surname = surname;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0){
            this.age = age;
        }
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}