package ŠestoPredavanje;

import javax.swing.*;

public class continueWithLabel {
    public static void main(String[] args) {
        //Napravit ćemo program koji provjerava da li "Adi" postoji u rečenici
        //Postavka zadatka:
        String recenica = "Postoji li Adi u rečenici?";
        String rijec = "Adi";
        boolean imaLiAdija = false;
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
            imaLiAdija = true;
            break;
        }
        String poruka = imaLiAdija ? "Ima!" : "Nažalost nema.";
        JOptionPane.showMessageDialog(null, poruka);
    }
}
