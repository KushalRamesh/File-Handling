import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class AppendToFileExample {
   public static void main( String[] args ) {

      try {
         String data = "India is a Country with Unity in Diversity";
         File f1 = new File("E");
         if(!f1.exists()) {
            f1.createNewFile();
         }
         FileWriter fileWritter = new FileWriter(f1.getName(),true);
         BufferedWriter bw = new BufferedWriter(fileWritter);
         bw.write(data);
         bw.close();
         System.out.println("File Appended");
      } catch(IOException e){
         e.printStackTrace();
      }
   }
}