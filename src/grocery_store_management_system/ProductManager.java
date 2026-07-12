package grocery_store_management_system;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ProductManager {
    private FileManager fileManager;
    private DefaultTableModel tableModel;
    private List<Product> products;
    
    public ProductManager(DefaultTableModel tableModel) {
        this.fileManager = new FileManager();
        this.tableModel = tableModel;
        this.products = new ArrayList<>();
        loadAllProducts();
    }
    
    private void loadAllProducts() {
        try {
            products = fileManager.loadProducts();
            refreshTable();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error loading products: " + e.getMessage());
        }
    }
    
    private void refreshTable() {
        tableModel.setRowCount(0);
        for (Product product : products) {
            tableModel.addRow(product.toArray());
        }
    }
    
    public void addProduct(Product product) {
        try {
            fileManager.saveProduct(product);
            products.add(product);
            tableModel.addRow(product.toArray());
            JOptionPane.showMessageDialog(null, "Product Added Successfully");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error saving product: " + e.getMessage());
        }
    }
    
    public List<Product> getProductsByCategory(String category) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getCategory().equalsIgnoreCase(category)) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }
    
    public List<Product> getProductsNeedingRestock() {
        List<Product> restockProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.needsRestock()) {
                restockProducts.add(product);
            }
        }
        return restockProducts;
    }
    
    public List<Product> getAllProducts() {
        return new ArrayList<>(products);
    }
    
    public void refreshProducts() {
        loadAllProducts();
    }
}