package ss4_Class_and_Object_on_java.bai_tap.bai1;

import java.util.Scanner;

public class GiaiPhuongTrinhBacHai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập a");
        double a = sc.nextDouble();
        System.out.print("Nhập b");
        double b = sc.nextDouble();
        System.out.print("Nhập c");
        double c = sc.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a,b,c);
        double delta = equation.getDiscriminant();
        if (delta > 0) {
            System.out.println("Phương trình có hai nghiệm:");
            System.out.println("Nghiệm 1: " + equation.getRoot1());
            System.out.println("Nghiệm 2: " + equation.getRoot2());
        } else if (delta == 0) {
            System.out.println("Phương trình có một nghiệm kép:");
            System.out.println("Nghiệm: " + equation.getRoot1());  // hoặc getRoot2()
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
