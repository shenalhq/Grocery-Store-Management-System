package grocery_store_management_system;

public class Product {
    private String id;
    private String name;
    private String category;
    private String supplier;
    private double price;
    private int quantity;
    
    public Product(String id, String name, String category, String supplier, 
                   double price, int quantity) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.supplier = supplier;
        this.price = price;
        this.quantity = quantity;
    }
    
    
    public String getId() { return id; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public String getSupplier() { return supplier; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    
   
    public void setQuantity(int quantity) { this.quantity = quantity; }
    
   
    public boolean needsRestock() {
        return quantity <= 10;
    }
    
   
    public String toCSV() {
        return id + "," + name + "," + category + "," + supplier + "," + 
               price + "," + quantity;
    }
    
    
    public String[] toArray() {
        return new String[]{id, name, category, supplier, 
                           String.format("%.2f", price), 
                           String.valueOf(quantity)};
    }
    
    public static Product fromCSV(String csvLine) {
        String[] parts = csvLine.split(",");
        if (parts.length == 6) {
            try {
                return new Product(parts[0], parts[1], parts[2], parts[3],
                                 Double.parseDouble(parts[4]),
                                 Integer.parseInt(parts[5]));
            } catch (NumberFormatException e) {
                return null;
            }
        }
        return null;
    }
}