package ČetvrtoPredavanje;

import javax.swing.*;

public class StringSwitchDemo {
    public static void main(String[] args) {

        String imeDanaUSedmici = JOptionPane.showInputDialog("Unesi ime dana u sedmici:");
        int redniBrojDanaUSedmici = 0;
        String imeDanaNeosjetljivo = imeDanaUSedmici.toLowerCase();
        switch(imeDanaNeosjetljivo){
            case "monday":
                redniBrojDanaUSedmici = 1;
                break;
            case "tuesday":
                redniBrojDanaUSedmici = 2;
                break;
            case "wednesday":
                redniBrojDanaUSedmici = 3;
                break;
            case "thursday":
                redniBrojDanaUSedmici = 4;
                break;
            case "friday":
                redniBrojDanaUSedmici = 5;
                break;
            case "saturday":
                redniBrojDanaUSedmici = 6;
                break;
            case "sunday":
                redniBrojDanaUSedmici = 7;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Niste unjeli tačan naziv dana u sedmici.");
                break;
        }
        if(redniBrojDanaUSedmici != 0) {
            String konacnaPoruka = String.format("Za uneseni dan '%s' redni broj tog dana je '%d'.", imeDanaUSedmici, redniBrojDanaUSedmici);
            JOptionPane.showMessageDialog(null, konacnaPoruka);
        }
    }
}
