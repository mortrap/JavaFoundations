package exceptions;

import lombok.Getter;

@Getter
public class Person {
    private String name;
    private int age;
    private String sex;

    public Person(String name, int age, String sex) throws MyException {
        if(name.charAt(0)==name.toUpperCase().charAt(0)){
        this.name = name;}
        else{
            throw new MyRuntimeException("First char of name most be in upper case");
        }
        this.sex = sexParser(sex);
        if (age > 0) {
            this.age = age;
        } else {
            throw new MyRuntimeException("Age is < 0");
        }
    }

    public void setAge(int age) throws MyException {
        if (age < 0) {
            throw new MyException("Age<0");
        }
        this.age = age;
    }

    public void setSex(String sex) throws MyException {
        this.sex = sexParser(sex);
    }

    public String sexParser(String sex) throws MyException {
        if (sex.equalsIgnoreCase("male") || sex.equalsIgnoreCase("female")) {
            return this.sex = sex;
        } else {
            throw new MyException("Sex most be only male or female");
        }

    }
}
