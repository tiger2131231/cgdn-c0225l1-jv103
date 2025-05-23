package ss5_Access_modifier_static_method_and_property.bai_tap.bai2;

public class Student {
    private String name = "John";
    private String classes = "C02";

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }


    public void displayInfo() {
        System.out.println("Tên: " + name + ", Lớp: " + classes);
    }
}

