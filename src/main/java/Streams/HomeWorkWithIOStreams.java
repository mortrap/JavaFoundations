package Streams;

import java.io.*;

public class HomeWorkWithIOStreams {
    public static void main(String[] args) {
        File file1 = new File("src/Resources/firstfile.txt");
        try (PrintWriter printWriter = new PrintWriter(file1)) {
            printWriter.println("It is a good day to die for a first file");
            printWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        File file2 = new File("src/Resources/secondfile.txt");
        try (PrintWriter printWriter = new PrintWriter(file2)) {
            printWriter.println("Glittering prises");
            printWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        File file3 = new File("src/Resources/thirdfile.txt");
        try (BufferedReader fileReader = new BufferedReader(new FileReader("src/Resources/firstfile.txt"));
             PrintWriter printWriter = new PrintWriter(file3)) {
            printWriter.println(fileReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader fileReader = new BufferedReader(new FileReader("src/Resources/secondfile.txt"));
             PrintWriter printWriter = new PrintWriter(file1)) {
            printWriter.println(fileReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader fileReader = new BufferedReader(new FileReader("src/Resources/thirdfile.txt"));
             PrintWriter printWriter = new PrintWriter(file2)) {
            printWriter.println(fileReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        file3.deleteOnExit();


    }
}
