package ČetvrtoPredavanje;

import javax.swing.*;

public class SwitchWithBreak {
    public static void main(String[] args) {
        String brojDanaText= JOptionPane.showInputDialog("Unesi broj dana:");
        int brojDana = Integer.parseInt(brojDanaText);
        String imeDanaNaEngleskom= "0";

        switch (brojDana) {
            case 1:
                imeDanaNaEngleskom = "Monday";
                break;

            case 2:
                imeDanaNaEngleskom = "Tuesday";
                break;

            case 3:
                imeDanaNaEngleskom = "Wednesday";
                break;

            case 4:
                imeDanaNaEngleskom = "Thursday";
                break;

            case 5:
                imeDanaNaEngleskom = "Friday";
                break;

            case 6:
                imeDanaNaEngleskom = "Saturday";
                break;

            case 7:
                imeDanaNaEngleskom = "Sunday";
                break;

            default:
                    JOptionPane.showMessageDialog(null, "Sedmica ima 7 dana. Unjeti broj od 1 do 7. Hvala. :)");
                    break;
                     }
            if (imeDanaNaEngleskom != "0" ) {
        String konacanText = "Naziv odabranog dana u sedmici na engleskom je: " + imeDanaNaEngleskom + ".";
        JOptionPane.showMessageDialog(null, konacanText);
            }
    }
}
