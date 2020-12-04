package ČetvrtoPredavanje;

import javax.swing.*;

public class switchSpojeniCaseovi {

    public static void main(String[] args) {
        String redniBrojMjesecaText = JOptionPane.showInputDialog("Unesi redni broj mjeseca: ");
        int redniBrojMjeseca = Integer.parseInt(redniBrojMjesecaText);
        String brojGodineText = JOptionPane.showInputDialog("Unesi broj godine:");
        int brojGodine = Integer.parseInt(brojGodineText);
        int brojDanaUMjesecu=0;
        switch (redniBrojMjeseca) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                brojDanaUMjesecu = 31;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                brojDanaUMjesecu = 30;
                break;

            case 2:
                boolean uslovPrvi = brojGodine % 4 == 0 && brojGodine % 100 !=0;
                boolean uslovDrugi = brojGodine %  400 ==0;
                boolean prestupnaGodina = uslovPrvi || uslovDrugi;
                if(prestupnaGodina) {
                    brojDanaUMjesecu = 29;
                }else{
                  brojDanaUMjesecu = 28;
                }
                break;

            default:
                JOptionPane.showMessageDialog(null, "Unesite broj od 1 do 12.");
                break;
        }
        if(brojDanaUMjesecu != 0){
        String poruka = "Za uneseni mjesec '" + redniBrojMjeseca + "' i godinu '" +brojGodine + "' broj dana u mjesecu je '" + brojDanaUMjesecu + "'."; //Prvi način ispisa neke poruke korisniku
        String poruka1 = String.format("Za uneseni mjesec '%d' i godinu '%d' broj dana u mjesecu je '%d'.", redniBrojMjeseca,brojGodine, brojDanaUMjesecu);// Drugi način ispisa neke poruke korisniku
        JOptionPane.showMessageDialog(null, poruka1);
        }
    }
}
