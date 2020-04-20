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
            System.out.println("Enter the text");
            s = reader.readLine();
//            int count = 0;
//            boolean isFlag = false;
//            for (int i = 0; i < stringArray.length; i++) {
//                if (stringArray[i] == null) {
//                    stringArray[i] = s;
//                    break;
//                }
//                count++;
//                if (count == 9) {
//                    isFlag = true;
//                }
//            }
//            if (isFlag) {
//                for (int j = 0; j < stringArray.length - 1; j++) {
//                    stringArray[j] = stringArray[j + 1];
//                }
//                stringArray[stringArray.length - 1] = " ";
//            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader fileReader = new BufferedReader(new FileReader(path))
        ) {
            String input;
            int numb = 0;
            while ((input = fileReader.readLine()) != null) {
                stringArray[numb] = input;
                numb++;
            }
            if (numb <= 9) {
                stringArray[numb] = s;
            } else {
                stringMove(stringArray);
                stringArray[stringArray.length - 1] = s;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (PrintWriter writer = new PrintWriter(path)) {
            for (
                    String line : stringArray) {
                writer.println(line);
            }
            writer.flush();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    public static void stringMove(String[] s) {
        for (int j = 0; j < s.length - 1; j++) {
            s[j] = s[j + 1];
        }
        s[s.length - 1] = " ";
    }

}


