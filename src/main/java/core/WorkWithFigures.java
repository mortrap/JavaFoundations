package core;

public class WorkWithFigures {
    public static void main(String[] args) {
        TriAngle triangle = new TriAngle(3, 15, 7, 21 );
        triangle.lineDetect(triangle.getLineA(), triangle.getLineB(), triangle.getLineC());
        triangle.anglesDetect(TriAngle.anglesName(TriAngle.lines), TriAngle.lines);
        triangle.trianglesCharacteristics(TriAngle.lines);
        Circle circle = new Circle(1, 2, 5);
        circle.circlesArea(Circle.PI, circle.getRadius());
        TriAngle.execute(TriAngle.lines);
    }
}
