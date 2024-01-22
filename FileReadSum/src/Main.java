import java.io.*;

public class Main {
    public static void main(String[] args) {

        try {
            FileReader file = new FileReader("input.txt");
            BufferedReader input = new BufferedReader(file);
            String line;
            int sumInput= 0;
            while ((line = input.readLine()) != null) {
                sumInput += Integer.parseInt(line);
            }
            System.out.println("Dosyadaki sayıların toplamı: " + sumInput);
            input.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }
}

