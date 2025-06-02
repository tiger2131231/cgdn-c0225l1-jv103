package ss7_Abstract_Class_and_Interface.bai_tap.bai1;


public class Circle  {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return Math.PI * radius * radius;
    }
}
