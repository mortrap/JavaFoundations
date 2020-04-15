package exceptions;

public class SnowFlakePerson extends Person {
    private String selfVision;

    public SnowFlakePerson(String name, int age, String sex, String selfVision) throws MyException {
        super(name, age, sex);
        this.selfVision = selfVision;
    }

    public void setOpinionSex(String selfVision) {
        this.selfVision = selfVision;
    }

    public String getOpinionSex() {
        return selfVision;
    }

}
