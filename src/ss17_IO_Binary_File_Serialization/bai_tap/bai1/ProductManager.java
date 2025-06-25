package ss17_IO_Binary_File_Serialization.bai_tap.bai1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private static final String FILE_PATH = "products.csv";

    public void addProduct(Product product) {
        try {
            FileWriter fw = new FileWriter(FILE_PATH, true);
            fw.write(product.toCSV() + "\n");
            fw.close();
        } catch (IOException e) {
            System.out.println("Lỗi ghi file: " + e.getMessage());
        }
    }

    public List<Product> getAllProducts() {
        List<Product> list = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE_PATH));
            String line;
            while ((line = br.readLine()) != null) {
                Product p = Product.fromCSV(line);
                if (p != null) {
                    list.add(p);
                }
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Lỗi đọc file: " + e.getMessage());
        }
        return list;
    }

    public void displayAll() {
        List<Product> list = getAllProducts();
        if (list.isEmpty()) {
            System.out.println("Danh sách sản phẩm trống.");
        } else {
            for (Product p : list) {
                System.out.println(p);
            }
        }
    }

    public void searchByName(String keyword) {
        List<Product> list = getAllProducts();
        boolean found = false;
        for (Product p : list) {
            if (p.getName().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(p);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sản phẩm nào với từ khóa \"" + keyword + "\".");
        }
    }
}