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
    static Integer[] lines;
    private double[] angles;


    public TriAngle(int countPoint, Integer lineA, Integer lineB, Integer lineC) {
        super(countPoint);
        this.lineA = lineA;
        this.lineB = lineB;
        this.lineC = lineC;
        this.angleAB = angleAB;
        this.angleBC = angleBC;
        this.angleAC = angleAC;
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

    public Integer[] lineDetect(Integer lineA, Integer lineB, Integer lineC) {
        Integer[] linesArray = new Integer[]{lineA, lineB, lineC};
        int temp;
        for (int j = 0; j < linesArray.length; j++) {
            for (int i = 0; i < linesArray.length - 1 - j; i++) {
                if (linesArray[i] > linesArray[i + 1]) {
                    temp = linesArray[i + 1];
                    linesArray[i + 1] = linesArray[i];
                    linesArray[i] = temp;
                }
            }
        }
        lines = linesArray;
        System.out.println(Arrays.toString(linesArray));
        return lines;
    }

    public static String anglesName(Integer[] lines) {
        String anglesName;
        if (lines[0].equals(lines[2])) {
            anglesName = "Equilateral Triangle";
        } else if (lines[0].equals(lines[1]) || lines[1].equals(lines[2])) {
            anglesName = "Isosceles Triangle";
        } else {
            anglesName = "Versatile Triangle";
        }
        System.out.println(anglesName);
        return anglesName;
    }

    public void anglesDetect(String anglesName, Integer[] lines) {
        int pow = 2;
        if (anglesName.equals("Equilateral Triangle")) {
            angleAB = 60;
            angleBC = 60;
            angleAC = 60;
        } else if (anglesName.equals("Isosceles Triangle")) {
            angleAB = (pow(lines[0], pow) + pow(lines[1], pow) - pow(lines[2], pow)) / (2 * lines[0] * lines[1]);
            angleAB = cos(angleAB) * 100;
            angleAB = abs(angleAB);
            angleBC = (180 - angleAB) / 2;
            angleAC = angleBC;
        } else if (anglesName.equals("Versatile Triangle")) {
            angleAB = (pow(lines[0], pow) + pow(lines[1], pow) - pow(lines[2], pow)) / (2 * lines[0] * lines[1]);
            angleAB = cos(angleAB) * 100;
            angleAB = abs(angleAB);
            angleBC = (pow(lines[1], pow) + pow(lines[2], pow) - pow(lines[0], pow)) / (2 * lines[1] * lines[2]);
            angleBC = cos(angleBC) * 100;
            angleBC = abs(angleBC);
            angleAC = 180 - (angleAB + angleBC);
        }
        double[] angleArray = new double[]{angleAB, angleBC, angleAC};
        System.out.println(Arrays.toString(angleArray));
        angles = angleArray;
    }

    public void trianglesCharacteristics(Integer[] lines) {
        double[] subLines = new double[]{lines[0], lines[1], lines[2]};
        double perimeter = subLines[0] + subLines[1] + subLines[2];
        double p = perimeter / 2;
        boolean isFlag = true;
        if (subLines[2] <= subLines[0] + subLines[1]) {
        } else isFlag = false;
        if (isFlag) {
            double area = (p * (p - subLines[0]) * (p - subLines[1]) * (p - subLines[2]));
            area = sqrt(area);
            System.out.println("Triangles area is: " + area);
        } else System.out.println("Does not satisfy the axiom of inequality");
    }

    public static void execute(Integer[] lines) {
        int oneLine = lines[0];
        int twoLine = lines[1];
        int threeLine = lines[2];
        while (threeLine >= oneLine + twoLine) {
            threeLine--;
        }int helper = (oneLine+twoLine) - threeLine;


        System.out.println("Correct lineA to: " + oneLine + " or lineB to: " + twoLine + " or lineC to: " + threeLine);
    }
}
