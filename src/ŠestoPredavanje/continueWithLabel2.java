package ŠestoPredavanje;

import javax.swing.*;

public class continueWithLabel2 {
    public static void main(String[] args) {
        //Napravit ćemo program koji provjerava koliko se puta "Adi" ponavlja u rečenici
        //Postavka zadatka:
        String recenica = "Adi kaže: 'Adi jeste Adi, a da nije Adi ne bi ni bio Adi.'";
        String rijec = "Adi";
        int brojac = 0;
        char[] recenicaNiz = recenica.toCharArray();
        char [] rijecNiz = rijec.toCharArray();
        //Izrada zadatka:
        A: for (int i = 0; i<recenicaNiz.length; i++){
            int k = i;// k nam je bitan iz razloga što omogućava da se mjenja u donjoj for petlji bez da se i mjenja.

            for(int j=0; j<rijecNiz.length; j++){
                char slovoURecenici = recenicaNiz[k++];
                char slovoRijeci = rijecNiz[j];
                if(slovoURecenici != slovoRijeci){
                    continue A;
                }
            }
            brojac++;
        }
        String poruka = "Riječ '" + rijec + "' u rečenici '" + recenica + "' se ponavlja '" + brojac + "' puta.";
        JOptionPane.showMessageDialog(null, poruka);
    }
}
