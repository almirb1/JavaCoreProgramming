package ČetvrtoPredavanje;

public class arrayLoopDemo {
    public static void main(String[] args) {

        // 1. način- ispis imena iz niza for petljom
        String [] imena = {"Adi", "Almir", "Nevena", "Amer", "Harun", "Jasmin", "Damir"};
        for(int i=0; i<imena.length; i++){
            System.out.println(imena[i]);
        }

        // 2. način- ispis imena iz niza while petljom
        int j = 0;
        while(j<imena.length){
            System.out.println(imena[j]);
            j++;
        }
        //Enhanced For loop
        for (String ime: imena){
            System.out.println(ime);
        }
    }
    }
