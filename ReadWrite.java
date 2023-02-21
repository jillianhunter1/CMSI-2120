import java.io.*;
public class ReadWrite {
   public static void main(String args[]) throws IOException {
      FileReader input = null;
      FileWriter output = null;
      try {
         input = new FileReader("input.txt"); 
         output = new FileWriter("output.txt");
         int a;
         while ((a = input.read()) != -1) {
            output.write(a); }
         }finally {
            if (input != null) {
               input.close(); }
               if (output != null) { output.close();
} }
} }