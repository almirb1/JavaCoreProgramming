package PetoPredavanje;

import javax.swing.*;

public class breakDemoSaEnhancedForPetljom {
    public static void main(String[] args) {
        int [] brojevi = { 23, 13, 234, 456, 678, 12, 2000, 111};
        String uneseniBrojText = JOptionPane.showInputDialog("Unesite broj i okušajte sreću:");
        int uneseniBroj = Integer.parseInt(uneseniBrojText);
        boolean brojKojiSePodudara = false;
        for (int broj: brojevi){
            if(broj==uneseniBroj){
                brojKojiSePodudara = true;
                break;
            }
        }
        String konačnaPoruka = brojKojiSePodudara ? "Bravo! Pogodili ste broj i osvojili ste milion eura. :)":
                "Nažalost niste imali sreće ovaj put. Više sreće sljedeći put. ";
        JOptionPane.showMessageDialog(null, konačnaPoruka);
    }
}
