package ss5_Access_modifier_static_method_and_property.bai_tap.bai1;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    // Constructor không tham số
    public Circle() {
    }

    // Constructor có tham số radius
    public Circle(double r) {
        radius = r;
    }

    // Getter cho radius
    public double getRadius() {
        return radius;
    }

    // Phương thức tính diện tích
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
