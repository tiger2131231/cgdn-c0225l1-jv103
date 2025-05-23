package ss5_Access_modifier_static_method_and_property.bai_tap.bai2;

public class Test {
    public static void main(String[] args) {
        Student student = new Student(); // Khởi tạo đối tượng Student

        // Gán lại giá trị
        student.setName("Alice");
        student.setClasses("JV01");

        // In ra để kiểm tra
        student.displayInfo(); // Output: Tên: Alice, Lớp: JV01
    }
}

