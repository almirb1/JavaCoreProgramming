package PetoPredavanje;

import javax.swing.*;

public class continueDemo {
    public static void main(String[] args) {
        String text = "petar pan jede palačinke";
        char [] nizKarakteraRečenice = text.toCharArray();// ovdje gornju rečenicu razbijam karakter po karakter i činim niz od tih karaktera
        //sad trebam ovaj niz karaktera provjeravat jedan po jedan i svaki put kad mi se karakter p podudara da mi se brojač povećća za 1 itd.
        int brojač = 0;

        for (int i = 0; i<nizKarakteraRečenice.length; i++){
            char karakter = nizKarakteraRečenice[i];//ovdje kažemo: "Ej programu, varijabla karakter uzima od svakog indexa po jedan karakter
                                                    //iz niza nizKarakteraRečenice i ujednačuje ga
            if(karakter != 'p'){
                continue;
            }
            brojač++;
        }
        String poruka = "U rečenici: 'petar pan jede palačinke' slovo 'p' se pojavljuje " + brojač + " puta.";
        JOptionPane.showMessageDialog(null, poruka);
    }
}
