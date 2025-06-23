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
        String[] parts = line.split(",");
        return new Product(
                parts[0],
                parts[1],
                Double.parseDouble(parts[2]),
                parts[3],
                parts[4]
        );
    }

    @Override
    public String toString() {
        return "Mã: " + id + " | Tên: " + name + " | Giá: " + price +
                " | Hãng: " + manufacturer + " | Mô tả: " + description;
    }

    public String getName() {
        return name;
    }
}
