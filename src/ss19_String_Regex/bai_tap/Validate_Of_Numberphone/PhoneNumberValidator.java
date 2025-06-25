package ss19_String_Regex.bai_tap.Validate_Of_Numberphone;

public class PhoneNumberValidator {
    public static boolean isValidPhoneNumber(String phoneNumber) {

        String regex = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";
        return phoneNumber.matches(regex);
    }

    public static void main(String[] args) {
        String[] samples = {
                "(84)-(0978489648)",
                "(a8)-(22222222)",
                "(84)-(22b22222)",
                "(84)-(9978489648)",
                "(84)-(0123456789)"
        };

        for (String s : samples) {
            System.out.printf("Số điện thoại '%s' hợp lệ? → %b%n", s, isValidPhoneNumber(s));
        }
    }
}





























































// Regex giải thích:
// ^            : bắt đầu chuỗi
// \(           : dấu mở ngoặc (escaped vì là ký tự đặc biệt)
// \d{2}        : đúng 2 chữ số (xx)
// \)           : dấu đóng ngoặc
// -            : dấu gạch nối
// \(0\d{9}\)   : 1 số 0 theo sau 9 chữ số nữa
// $            : kết thúc chuỗi