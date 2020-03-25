package core;

import java.util.Arrays;

import static java.lang.Math.*;

public class Detector {
    static double angleAB;
    static double angleBC;
    static double angleAC;
    static Integer[] lines;
    static double[] angles;

    public static Integer[] lineDetect(Integer lineA, Integer lineB, Integer lineC) {
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

    public static double[] anglesDetect(String anglesName, Integer[] lines) {
        int pow = 2;
        if (anglesName.equals("Equilateral Triangle")) {
            angleAB = 60.0;
            angleBC = 60.0;
            angleAC = 60.0;
        } else if (anglesName.equals("Isosceles Triangle")) {
            angleAB = (pow(lines[0], pow) + pow(lines[1], pow) - pow(lines[2], pow)) / (2 * lines[0] * lines[1]);
            angleAB = cos(angleAB);
            angleAB = toDegrees(angleAB);
            angleBC = (180 - angleAB) / 2;
            angleAC = angleBC;
        } else if (anglesName.equals("Versatile Triangle")) {
            if(pow(lines[2], pow)==pow(lines[0], pow) + pow(lines[1], pow)){
                angleAB = 90.0;
                angleBC = (pow(lines[1], pow) + pow(lines[2], pow) - pow(lines[0], pow)) / (2 * lines[1] * lines[2]);
                angleBC = cos(angleBC);
                angleBC = toDegrees(angleBC);
                angleAC = 180 - (angleAB + angleBC);
            }else{
            angleAB = (pow(lines[0], pow) + pow(lines[1], pow) - pow(lines[2], pow)) / (2 * lines[0] * lines[1]);
            angleAB = cos(angleAB);
            angleAB = toDegrees(angleAB);
            angleBC = (pow(lines[1], pow) + pow(lines[2], pow) - pow(lines[0], pow)) / (2 * lines[1] * lines[2]);
            angleBC = cos(angleBC);
            angleBC = toDegrees(angleBC);
            angleAC = 180 - (angleAB + angleBC);}
        }
        double[] angleArray = new double[]{angleAB, angleBC, angleAC};
        System.out.println(Arrays.toString(angleArray));
        angles = angleArray;
        return angles;
    }

    public static void trianglesCharacteristics(Integer[] lines) {
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

    public static void check(Integer[] lines) {
        int oneLine = lines[0];
        int twoLine = lines[1];
        int threeLine = lines[2];
        int count = 1;
        while (threeLine >= oneLine + twoLine) {
            threeLine--;
            count++;
        }
        int helper = (threeLine + count) - (oneLine + twoLine);
        if (helper > 0) {
            System.out.println("Increase lineA by: " + helper + " , or lineB by: " + helper + " , or reduce lineC by: " + helper);
        }
    }

    public static double circlesArea(double PI, double radius) {
        double circlesArea = PI * (radius * radius);
        System.out.println("Circles area is: " + circlesArea);
        return circlesArea;
    }

}


