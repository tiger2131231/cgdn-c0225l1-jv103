package ss17_IO_Binary_File_Serialization.bai_tap.bai1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private final String FILE_PATH = "products.csv";

    // Thêm sản phẩm vào file
    public void addProduct(Product p) {
        try (FileWriter fw = new FileWriter(FILE_PATH, true)) {
            fw.write(p.toCSV() + "\n");
        } catch (IOException e) {
            System.out.println("Lỗi ghi file: " + e.getMessage());
        }
    }

    // Đọc tất cả sản phẩm từ file
    public List<Product> getAllProducts() {
        List<Product> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                list.add(Product.fromCSV(line));
            }
        } catch (IOException e) {
            System.out.println("Lỗi đọc file: " + e.getMessage());
        }
        return list;
    }

    // Tìm sản phẩm theo tên
    public void searchByName(String keyword) {
        List<Product> list = getAllProducts();
        boolean found = false;
        for (Product p : list) {
            if (p.getName().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(p);
                found = true;
            }
        }
        if (!found) System.out.println("Không tìm thấy sản phẩm nào.");
    }

    // Hiển thị tất cả
    public void displayAll() {
        List<Product> list = getAllProducts();
        if (list.isEmpty()) {
            System.out.println("Danh sách trống.");
        } else {
            for (Product p : list) {
                System.out.println(p);
            }
        }
    }
}
