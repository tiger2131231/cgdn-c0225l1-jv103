package ss19_String_Regex.bai_tap.Validate_Of_Class;

public class ClassNameValidator {


    public static boolean isValidClassName(String className) {
        String regex = "^[CAP]\\d{4}[GHIK]$";
        return className.matches(regex);
    }

    // Test thử
    public static void main(String[] args) {
        String[] testSamples = {"C0223G", "A0323K", "M0318G", "P0323A", "P1234H", "A123!K"};

        for (String name : testSamples) {
            System.out.printf("Tên lớp '%s' hợp lệ? → %b%n", name, isValidClassName(name));
        }
    }
}






































































// Regex giải thích:
// ^           : bắt đầu chuỗi
// [CAP]       : 1 ký tự đầu là C hoặc A hoặc P
// \d{4}       : 4 chữ số
// [GHIK]      : 1 ký tự kết thúc là G, H, I hoặc K
// $           : kết thúc chuỗi