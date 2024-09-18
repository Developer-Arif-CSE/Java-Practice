import java.io.FileReader;
import java.io.FileWriter;

public class FExample {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("Out.txt");
            fw.write("File Write");
            fw.close();

            int ch;
            FileReader fr = new FileReader("Out.txt");
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch); 
            }
            fr.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
