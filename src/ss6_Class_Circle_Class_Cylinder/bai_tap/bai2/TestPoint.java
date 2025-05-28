package ss6_Class_Circle_Class_Cylinder.bai_tap.bai2;

public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(1.5f, 2.5f);

        System.out.println(p1);  // (0.0,0.0)
        System.out.println(p2);  // (1.5,2.5)

        p1.setXY(3.0f, 4.0f);
        System.out.println(p1);  // (3.0,4.0)
    }
}

