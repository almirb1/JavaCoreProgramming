package PetoPredavanje;

import javax.swing.*;

public class breakWithLabel {
    public static void main(String[] args) {
        String uneseniBrojText = JOptionPane.showInputDialog("Unesi željeni broji okušaj sreću:");
        int uneseniBroj = Integer.parseInt(uneseniBrojText);
        int[][] sretniBrojevi = {
                {1, 2, 3},
                {4 ,5 ,6, 7},
                {8, 9, 10}
                };
        boolean pogođenBroj = false;
       A: for (int i =0; i<sretniBrojevi.length; i++){
          int[] jedanNiz = sretniBrojevi[i]; //ovdje će program proći od nultog do drugog indexa (a svi ti indexi su ustvari novi nizovi)
          for (int j=0; j<jedanNiz.length; j++){
              int broj = jedanNiz[j]; //ovdje se iz npr nultog indexa (koji je ustvari niz) ujedničavaju sa nekom int varijablom imena broj.
                                        //Isto vrijedi i za ostale indexe.
              if(broj == uneseniBroj){
                  pogođenBroj = true;
                 break A;
              }
          }
    }
        String konačnaPoruka = pogođenBroj ? "Bravo! Pogodili ste broj. Milion maraka je Vaše." :
                "Nažalost niste pogodili broj. Više sreće drugi put.";
        JOptionPane.showMessageDialog(null, konačnaPoruka);
    }
}
