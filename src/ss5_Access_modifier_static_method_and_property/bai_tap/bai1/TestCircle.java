package ss5_Access_modifier_static_method_and_property.bai_tap.bai1;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(2.5);

        System.out.println("Hình tròn 1: Bán kính = " + c1.getRadius() + ", Diện tích = " + c1.getArea());
        System.out.println("Hình tròn 2: Bán kính = " + c2.getRadius() + ", Diện tích = " + c2.getArea());
    }
}

