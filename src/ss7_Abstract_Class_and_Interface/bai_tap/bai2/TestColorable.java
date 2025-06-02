package ss7_Abstract_Class_and_Interface.bai_tap.bai2;

public class TestColorable {
    public static void main(String[] args) {
        GeometricObject[] shapes = new GeometricObject[3];

        shapes[0] = new Square(4.0);
        shapes[1] = new GeometricObject() {
            @Override
            public double getArea() {
                return 10.0;
            }

            @Override
            public String toString() {
                return "Anonymous Geometric Shape";
            }
        };
        shapes[2] = new Square(5.5);

        for (GeometricObject shape : shapes) {
            System.out.println("Area: " + shape.getArea());
            if (shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            }
        }
    }
}

