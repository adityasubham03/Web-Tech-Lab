import java.io.*;

public class readwrite {
    public static void main(String[] args) {
        if (args.length >= 2) {
            try {
                FileWriter fout = new FileWriter(args[1]);
                FileReader fin = new FileReader(args[0]);

                int ch;
                while ((ch = fin.read()) != -1) {
                    fout.write((char) ch);
                }
                fout.close();
                fin.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Not enough arguments!!");
        }
    }
}
