package exceptions;

import java.lang.reflect.Field;

public class WorkWithExceptions {
    public static void main(String[] args) throws MyException, NoSuchFieldException {
        Person person = new Person("Gera", 20, "male");
        System.out.println(person.getName());
        try {
            person.setSex("mid");
        } catch (MyException e) {
            System.err.println("Bad sex");
            System.err.println(e.getMessage());
            e.printStackTrace();
            if (person.getName().charAt(person.getName().toCharArray().length - 1) == "a".charAt(0)) {
                person.setSex("female");
            } else {
                person.setSex("male");
            }
        } finally {
            System.out.println("Name:" + person.getName() + ". sex: " + person.getSex());
        }

        try {
            SnowFlakePerson snowFlakePerson = new SnowFlakePerson("sara", 34, "female",
                    "unicorn");
        } catch (Exception e) {
            System.err.println("Bad case for name");
            System.err.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Q");
        }
        try {
            System.out.println("H");
            if (true) {
                throw new RuntimeException();
            }
            System.out.println("A");
        } catch (Exception e) {
            System.out.println("E");
            try {
                System.out.println("L");
                System.out.println("L");
                if (true) {
                    throw new Error("O");
                }
                System.out.println("O");
            } catch (Throwable t) {
                System.out.println("IN");
            }
            System.out.println("THE");
        } catch (Throwable t) {
            System.out.println("EARTH");
        }
        System.out.println("MOON");
    }
}

