package core;

import javax.naming.InitialContext;

// 1 lineDetect. 2 anglesDetect...
public class WorkWithFigures {
    public static void main(String[] args) {
        TriAngle triangle = new TriAngle(3, 11, 11, 11);
        Detector.lineDetect(triangle.getLineA(), triangle.getLineB(), triangle.getLineC());
        Detector.anglesDetect(Detector.anglesName(Detector.lines), Detector.lines);
        Detector.trianglesCharacteristics(Detector.lines);
        Circle circle = new Circle(1, 2, 10);
        Detector.circlesArea(Circle.PI, circle.getRadius());
        TriAngle triangleSec = new TriAngle(3, 10, 10, 19);
        Detector.lineDetect(triangleSec.getLineA(), triangleSec.getLineB(), triangleSec.getLineC());
        Detector.anglesDetect(Detector.anglesName(Detector.lines), Detector.lines);
        Detector.check(Detector.lines);
    }
}
