package core;

import java.util.Arrays;

import static java.lang.Math.*;

public class TriAngle extends Figure {
    private Integer lineA;
    private Integer lineB;
    private Integer lineC;
    private double angleAB;
    private double angleBC;
    private double angleAC;

    public TriAngle(int countPoint, Integer lineA, Integer lineB, Integer lineC) {
        super(countPoint);
        this.lineA = lineA;
        this.lineB = lineB;
        this.lineC = lineC;
    }

//    public TriAngle(int countPoint, double angleAB, double angleBC, double angleAC) {
//        super(countPoint);
//        this.angleAB = angleAB;
//        this.angleBC = angleBC;
//        this.angleAC = angleAC;
//    }

    public void setAngleAC(double angleAC) {
        this.angleAC = angleAC;
    }

    public void setAngleBC(double angleBC) {
        this.angleBC = angleBC;
    }

    public void setAngleAB(double angleAB) {
        this.angleAB = angleAB;
    }

    public void setLineC(Integer lineC) {
        this.lineC = lineC;
    }

    public void setLineB(Integer lineB) {
        this.lineB = lineB;
    }

    public void setLineA(Integer lineA) {
        this.lineA = lineA;
    }

    public double getAngleAC() {
        return angleAC;
    }

    public double getAngleBC() {
        return angleBC;
    }

    public double getAngleAB() {
        return angleAB;
    }

    public Integer getLineC() {
        return lineC;
    }

    public Integer getLineB() {
        return lineB;
    }

    public Integer getLineA() {
        return lineA;
    }
}

