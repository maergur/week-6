import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("notlar.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String script = bufferedReader.readLine();
            System.out.println(script);
            bufferedReader.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir metin giriniz: ");
        String str = scanner.nextLine();

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("notlar.txt");
            BufferedWriter buffWriter = new BufferedWriter(fileWriter);
            buffWriter.write(str);
            buffWriter.close();
            System.out.println("Yazdığınız metin Notepad'e kaydedildi.");


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}