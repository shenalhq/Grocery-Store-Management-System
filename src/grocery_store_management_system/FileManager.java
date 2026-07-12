package grocery_store_management_system;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    private String productFilename;
    private String userFilename;
    
    public FileManager() {
        this.productFilename = "products.txt";
        this.userFilename = "users.txt";
        initializeDefaultFiles();
    }

    FileManager(String userstxt) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    private void initializeDefaultFiles() {
        try {
            File userFile = new File(userFilename);
            if (!userFile.exists()) {
                BufferedWriter writer = new BufferedWriter(new FileWriter(userFilename));
                writer.write("sales,sales123,SalesAssistant\n");
                writer.write("manager,manager123,StoreManager\n");
                writer.close();
            }
            
            File productFile = new File(productFilename);
            if (!productFile.exists()) {
                productFile.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
   
    public void saveProduct(Product product) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(productFilename, true))) {
            writer.write(product.toCSV());
            writer.newLine();
        }
    }
    
    public List<Product> loadProducts() throws IOException {
        List<Product> products = new ArrayList<>();
        File file = new File(productFilename);
        
        if (!file.exists()) {
            return products;
        }
        
        try (BufferedReader reader = new BufferedReader(new FileReader(productFilename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    Product product = Product.fromCSV(line);
                    if (product != null) {
                        products.add(product);
                    }
                }
            }
        }
        return products;
    }
    
    public void updateProducts(List<Product> products) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(productFilename, false))) {
            for (Product product : products) {
                writer.write(product.toCSV());
                writer.newLine();
            }
        }
    }
    
   
    public void saveUser(User user) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(userFilename, true))) {
            writer.write(user.toCSV());
            writer.newLine();
        }
    }
    
    public List<User> loadUsers() throws IOException {
        List<User> users = new ArrayList<>();
        File file = new File(userFilename);
        
        if (!file.exists()) {
            return users;
        }
        
        try (BufferedReader reader = new BufferedReader(new FileReader(userFilename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    User user = User.fromCSV(line);
                    if (user != null) {
                        users.add(user);
                    }
                }
            }
        }
        return users;
    }
}