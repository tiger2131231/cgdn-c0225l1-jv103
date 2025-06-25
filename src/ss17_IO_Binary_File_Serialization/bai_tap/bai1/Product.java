package ss17_IO_Binary_File_Serialization.bai_tap.bai1;

public class Product {
    private String id;
    private String name;
    private double price;
    private String manufacturer;
    private String description;

    public Product(String id, String name, double price, String manufacturer, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.description = description;
    }

    public String toCSV() {
        return id + "," + name + "," + price + "," + manufacturer + "," + description;
    }

    public static Product fromCSV(String line) {
        String[] parts = line.split(",", 5); // Giới hạn tách 5 phần để giữ nguyên mô tả
        if (parts.length < 5) return null;
        try {
            double price = Double.parseDouble(parts[2]);
            return new Product(parts[0], parts[1], price, parts[3], parts[4]);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Mã: " + id + " | Tên: " + name + " | Giá: " + price +
                " | Hãng: " + manufacturer + " | Mô tả: " + description;
    }
}