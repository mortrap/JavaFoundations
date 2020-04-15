package exceptions;

import java.lang.reflect.Field;

public class WorkWithExceptions  {
    public static void main(String[] args) throws MyException, NoSuchFieldException {
        Person person = new Person ("Gera", 20, "male");
        System.out.println(person.getName());
        try{person.setSex("mid"); }
        catch (MyException e){
            System.err.println("Bad sex");
            System.err.println(e.getMessage());
            e.printStackTrace();
            if(person.getName().charAt(person.getName().toCharArray().length-1)=="a".charAt(0)){
            person.setSex("female");}
            else{person.setSex("male");}
        }finally {
            System.out.println("Name:" + person.getName() + ". sex: " + person.getSex());
        }
        SnowFlakePerson snowFlakePerson = new SnowFlakePerson("Sara", 34, "female",
                "unicorn");

        try{snowFlakePerson.setSex(snowFlakePerson.getOpinionSex());
            Field field = Person.class.getDeclaredField("sex");
            field.setAccessible(true);
            field.set(person, snowFlakePerson.getOpinionSex());
        }
        catch (MyException | IllegalAccessException e){
            System.err.println("Bad sex for next people");
            System.err.println(e.getMessage());
        }
        finally {
            System.out.println("Name: " + snowFlakePerson.getName() +
                    ". " + "sex: " + snowFlakePerson.getSex());
        }
    }
}
