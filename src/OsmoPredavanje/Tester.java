package OsmoPredavanje;

public class Tester {
    public static void main(String[] args) {
        Student student1 = new Student();
 Dog dog= new Dog("Buddy");
 student1.setAnimal(dog);
 Cat cat = new Cat("Cicko");
 student1.setAnimal(cat);
 Hamster hamster = new Hamster("Putin");
 student1.setAnimal(hamster);
 Fish fish = new Fish("Zlatna ribica");
 student1.setAnimal(fish);
 Bird bird = new Bird("Tweety");
Tester tester = new Tester();
 tester.executorFlying(bird);
 Plain plain= new Plain();
tester.executorFlying(plain);
Flyable flyableObject = ()-> {
    System.out.println("Leteći objekat...");
};
    flyableObject.fly();

    int number1 = 23;
    int number2 = 13;
        System.out.println("Number 1= " + number1);
        System.out.println("Number 2= " + number2);
        swap(number1, number2);
        System.out.println("Number 1= " + number1);
        System.out.println("Number 2= " + number2);

        Person person1 = new Person() ;
        person1.setName("Boris");
        Person person2 = new Person();
        person2.setName("Mujaga");
        System.out.println("Prije swap:");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        swapPerson(person1, person2);
        System.out.println("Poslije swap:");
        System.out.println(person1.getName());
        System.out.println(person2.getName());

    }

    static void swap (int number1, int number2){
        System.out.println("Početak funkcije:");
        int temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("Number 1= " + number1);
        System.out.println("Number 2= " + number2);
        System.out.println("Kraj funkcije.");

    }

    static void swapPerson (Person p1, Person p2){
        String tempNameP1 = p1.getName();
        p1.setName(p2.getName());
        p2.setName(tempNameP1);
    }

    static  void executorFlying(Flyable flyable) {
        System.out.println("Sada će da poleti naš leteći objekat.");

    }
}
