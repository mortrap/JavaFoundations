package Streams;

import java.io.*;
import java.util.Arrays;

public class TextSaver {
    public static void main(String[] args) {
        String path = "";
        File file = new File(path);
        String[] stringArray = new String[10];
        String s = "";

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the path to file:");
            path = reader.readLine();
            if (path.equals("asd")) {
                path = "src/Resources/new.txt";
            }
            System.out.println("Enter the text");
            s = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader fileReader = new BufferedReader(new FileReader(path))
        ) {
            String input;
            int count = 0;
            while ((input = fileReader.readLine()) != null) {
                stringArray[count] = input;
                count++;
            }
            stringArray = stringMove(stringArray, s, count);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (PrintWriter writer = new PrintWriter(path)) {
            for (String line : stringArray) {
                if (line != null) {
                    writer.println(line);
                }
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String[] stringMove(String[] s, String str, int count) {
        if (count >= 9) {
            for (int j = 0; j < s.length - 1; j++) {
                s[j] = s[j + 1];
            }
            s[s.length - 1] = str;
        } else {
            s[count] = str;
        }
        return s;
    }

}


