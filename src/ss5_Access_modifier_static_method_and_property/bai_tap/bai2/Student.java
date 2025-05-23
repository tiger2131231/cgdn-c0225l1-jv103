package ss5_Access_modifier_static_method_and_property.bai_tap.bai2;

public class Student {
    private String name = "John";
    private String classes = "C02";

    // Constructor không tham số
    public Student() {
    }

    // Setter cho name
    public void setName(String name) {
        this.name = name;
    }

    // Setter cho classes
    public void setClasses(String classes) {
        this.classes = classes;
    }

    // (Tùy chọn) Thêm phương thức để hiển thị thông tin, phục vụ kiểm tra
    public void displayInfo() {
        System.out.println("Tên: " + name + ", Lớp: " + classes);
    }
}

