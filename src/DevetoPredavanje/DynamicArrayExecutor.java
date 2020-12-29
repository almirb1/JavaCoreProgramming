package DevetoPredavanje;

import java.util.*;

public class DynamicArrayExecutor {
    public static void main(String[] args) {
        String [] names = new String[2];
        names[0]= "Albin";
        names[1] = "Adna";
        System.out.println(names[1]);

        System.out.println("Ide List:");
        ArrayList<String> names1 = new ArrayList<>();
            names1.add("Albin");
            names1.add("Adna");
            names1.add("Damir");
            names1.add("Damir");
            printCollection(names1);

        System.out.println("Ide set:");
        Set<String> setOfNames = new HashSet<>();
        setOfNames.add("Albin");
        setOfNames.add("Adna");
        setOfNames.add("Damir");
        setOfNames.add("Damir");
        printCollection(setOfNames);

    }

    static void printCollection(Collection<String> listOfNames){
        for(String name: listOfNames){
            System.out.println(name);
        }
    }
}
