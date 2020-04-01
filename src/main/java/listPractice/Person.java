package listPractice;


public class Person implements Comparable<Person>, Cloneable {
    private String name;
    private String sex;
    private String surname;
    private int age;
    private String category;

    public Person(String name, String surname, String sex, int age, String category) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.age = age;
        this.category = category;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Person person = (Person) obj;

        if (age != person.age) return false;
        if (category != null ? !category.equals(person.name) : person.category != null) return false;// тернарный if
        if (name != null ? !name.equals(person.name) : person.name != null) return false;// тернарный if
        return sex != null ? sex.equals(person.sex) : person.sex == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (category != null ? category.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Person person) {
        if (!this.surname.equals(person.surname)) {
            return this.surname.charAt(0) - person.surname.charAt(0);
        } else if (!this.name.equals(person.name)) {
            return this.name.charAt(0) - person.name.charAt(0);
        } else {
            return this.age - person.age;
        }
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

