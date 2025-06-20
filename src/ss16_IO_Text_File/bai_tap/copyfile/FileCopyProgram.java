package ss16_IO_Text_File.bai_tap.copyfile;

import java.io.*;
import java.util.Scanner;

public class FileCopyProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập đường dẫn tệp nguồn: ");
        String sourcePath = scanner.nextLine();

        System.out.print("Nhập đường dẫn tệp đích: ");
        String targetPath = scanner.nextLine();

        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);

        if (!sourceFile.exists()) {
            System.out.println("Tệp nguồn không tồn tại!");
            return;
        }

        if (targetFile.exists()) {
            System.out.println("Tệp đích đã tồn tại!");
            return;
        }

        int charCount = 0;

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(targetFile)) {

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
                charCount++;
            }

            System.out.println("Sao chép thành công.");
            System.out.println("Tổng số ký tự đã sao chép: " + charCount);

        } catch (IOException e) {
            System.out.println("Có lỗi khi sao chép tập tin: " + e.getMessage());
        }
    }
}
