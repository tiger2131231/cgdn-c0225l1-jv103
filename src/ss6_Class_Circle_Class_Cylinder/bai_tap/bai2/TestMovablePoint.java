package ss6_Class_Circle_Class_Cylinder.bai_tap.bai2;

public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint mp = new MovablePoint(1.0f, 2.0f, 0.5f, 1.5f);

        System.out.println(mp);

        mp.move();
        System.out.println(mp);

        mp.move();
        System.out.println(mp);
    }
}

