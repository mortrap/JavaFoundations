package exceptions;

public class SnowFlakePerson extends Person {
    private String opinionSex;

    public SnowFlakePerson(String name, int age, String sex, String opinionSex) throws MyException {
        super(name, age, sex);
        if (sex.equalsIgnoreCase(opinionSex)) {
            this.opinionSex = opinionSex;
        } else {
            throw new MyError("Opinion about gender is more important, the brain has no gender");
        }
    }

    public void setOpinionSex(String opinionSex) {
        this.opinionSex = opinionSex;
    }public String getOpinionSex(){
        return opinionSex;
    }

}
