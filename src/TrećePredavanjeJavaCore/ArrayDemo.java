package TrećePredavanjeJavaCore;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] numbers = new int[2];
        numbers[0] = 23;
        numbers[1] = 34;
        int[] numbers1={23, 34};

        //Višedimenzioni niz
        String [] imena = new String[15];
        imena [0] = "Mirnes";
        imena[1] = "Adi";
        imena [2] = "Irfan";
        imena[3] ="Harun";

        String [][] names = {
                {"Gospodin", "Gospođa"},
                {"Smith","Jones"}
        };
        String gđa = names [0] [1] + " " + names[1][1];
        System.out.println(gđa);
        String gdin = names[0][0] + " " + names[1][0];
        System.out.println(gdin);

        //Kopiranje niza:
    char[] copyFrom = {'d', 'f', 'c', 'a', 'f', 'f',
                        'e', 't', 'i', 'n'};
    char[] copyTo =  new char[8];
    System.arraycopy(copyFrom, 2, copyTo, 0, copyTo.length);
        System.out.println(copyTo);
    }
}
