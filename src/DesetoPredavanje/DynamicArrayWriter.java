package DesetoPredavanje;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class DynamicArrayWriter {
    private ArrayList<Integer> lista = new ArrayList<>();

    public DynamicArrayWriter() {
        for (int i=0; i<=10; i++) {
            lista.add(i);
        }


    }

  public void writeListIntoFile() throws IOException{
        PrintWriter out = null;
     try{
         FileWriter fileWriter = new FileWriter("output.txt");
         out = new PrintWriter(fileWriter);
         for (int i = 0; i<lista.size(); i++){
             out.println("Value at: " + i + " is: " + lista.get(i));
         }

     }catch (IOException exception){
         System.err.println(exception.getMessage());

     }finally {
         if(out!= null) {
             out.close();
         }

     }

  }
// Ovo dole je try with resources. Razlikuje se od običnog try-a u tome da kod ovog novog idu zagrade u koje se upisuje nešto
  public void readFile(){
     try( FileReader fileReader =new FileReader("output.txt");
      BufferedReader br = new BufferedReader(fileReader);){
        String line = null;
        while ((line = br.readLine()) != null){
            System.out.println(line);

        }
     }catch(FileNotFoundException e1) {
         JOptionPane.showMessageDialog(null, "Nisi unjeo dobar naziv fajla.");
     }catch (Exception e2){
System.err.println(e2.getMessage());
     }
  }
}
