package DevetoPredavanje;

import DevetoPredavanje.Enumareted.Gender;
import OsmoPredavanje.Person;

public class GenericTester {
    public static void main(String[] args) {

        int number = 23;
        Gender spol = Gender.FEMALE;
        Person person = new Person();
        person.setName("Elma");
        person.setAge(13);

        Box<Gender> kutija1= new Box<Gender>();
        kutija1.setPolje(Gender.FEMALE);
        Box<String> kutija2 = new Box<String>();
        kutija2.setPolje("Elma");
        Box<Integer> kutija3 = new Box<Integer>();
        kutija3.setPolje(23);
    }
}
