package ŠestoPredavanje;

import javax.swing.*;

public class continueWithLabel3 {
    public static void main(String[] args) {
        //Hoću da napravim program koji od korisnika traži da upiše neku rečenicu i onda i riječ i da se prebroji koliko puta se ta riječ nalazi
        //upisanoj rečenici
        String recenica = JOptionPane.showInputDialog("Unesite željenu rečenicu:");
        String rijec = JOptionPane.showInputDialog("Unesite riječ koju želite provjeriti koliko se puta ponavalja u rečenici:");
        char [] recenicaNiz = recenica.toCharArray();
        char[] rijecNiz = rijec.toCharArray();
        int brojac = 0;

        int i = 0;
        A:while (i<recenicaNiz.length){
            int k = i;
            int j = 0;
            while(j<rijecNiz.length){
                char slovoURecenici = recenicaNiz[k++];
                char slovoURijeci = rijecNiz[j];
                if (slovoURecenici != slovoURijeci){
                    i++;
                    continue A;
                } else{
                    j++;
                }
            }
            brojac ++;
            i+=3;
        }
        String poruka = "Riječ '" + rijec + "' u rečenici '" + recenica + "' se ponavlja '" + brojac + "' puta.";
        JOptionPane.showMessageDialog(null, poruka);
    }
}
