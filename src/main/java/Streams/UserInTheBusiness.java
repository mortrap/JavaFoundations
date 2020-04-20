package Streams;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class UserInTheBusiness {
    public static void main(String[] args) {
        Map<String, User> usersFieldsMap = new HashMap<>();
        String login;
        String password;
        User user1 = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            user1 = new User(login = reader.readLine(), password = reader.readLine(), "");
        } catch (IOException e) {
            e.printStackTrace();
        }
        usersFieldsMap.put("User1", user1);
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream
                    (new FileOutputStream("src/Resources/user1.out"));
            outputStream.writeObject(user1);
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            ObjectInputStream inputStream = new ObjectInputStream
                    (new FileInputStream("src/Resources/user1.out"));
            User subUser1 = (User) inputStream.readObject();
            usersFieldsMap.put("subUser1", subUser1);
            System.out.println("Login: " + subUser1.getLogin() + " , password: " +
                    subUser1.getPassword());
            inputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        for (User user:usersFieldsMap.values()
             ) {
            System.out.println("user.getPassword() = " + user.getPassword() +
                    " , Style: " + user.getStyle());

        }
    }
}
