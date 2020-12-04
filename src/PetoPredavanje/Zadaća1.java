package PetoPredavanje;

import javax.swing.*;

public class Zadaća1 {

    //IMA GREŠKA!
    public static void main(String[] args) {
        String text = "adi kaže:' adi je adi i da nije adi ne bi ni bio adi.";
        char[] karakteriRečenice= text.toCharArray();
        int brojač1 = 0;
        int brojač2 = 0;
        A:for(int i=0; i<karakteriRečenice.length; i++){
            char karakter = karakteriRečenice [i];//i
            char [] adiNiz = {'a', 'd', 'i'};
            for (int j=0; j<adiNiz.length; j++){
                char adiKarakter = adiNiz[j]; //i
                if(karakter==adiKarakter) {
                    brojač1++;
                    if(brojač1 <3) {
                   continue A;
                    }else {
                        break;
                    }
                }
            }
            brojač2 ++;
        }
        String poruka = "Riječ 'adi' se u rečenici 'adi kaže:' adi je adi i da nije adi ne bi ni bio adi.' pojavljuje " + brojač2 +
                " puta.";
        JOptionPane.showMessageDialog(null, poruka);
    }
}
