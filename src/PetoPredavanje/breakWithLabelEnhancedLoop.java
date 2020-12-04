package PetoPredavanje;

import javax.swing.*;

public class breakWithLabelEnhancedLoop {
    public static void main(String[] args) {
        String uneseniBrojText = JOptionPane.showInputDialog("Unesi željeni broji okušaj sreću:");
        int uneseniBroj = Integer.parseInt(uneseniBrojText);
        int[][] sretniBrojevi = {
                {1, 2, 3},
                {4 ,5 ,6, 7},
                {8, 9, 10}
        };
        boolean pogođenBroj = false;
        A: for (int[] jedanNiz: sretniBrojevi){
            for (int broj: jedanNiz){
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
