package grocery_store_management_system;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class SalesAssistantFrame extends javax.swing.JFrame {

    
    public SalesAssistantFrame() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        jitemid = new javax.swing.JTextField();
        jitemname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Jcategory = new javax.swing.JComboBox();
        jsupplier = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jquantity = new javax.swing.JTextField();
        jprice = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grocery_store_management_system/oop8.jpeg"))); // NOI18N
        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" SALES ASSISTANT DASHBOARD - The Green Basket  ");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 860, 60));

        jButton4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton4.setText("Logout");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, 110, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PRODUCT MANAGEMENT     ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 310, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Category", "Supplier", "Price", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 840, 180));

        jButton2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 120, 40));

        jComboBox2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fresh Produce", "Dairy", "Beverages", "Snacks", "Cleaning Supplies" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 310, 40));

        jButton3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton3.setText("View all Items");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 240, 40));
        jPanel1.add(jitemid, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 163, 31));
        jPanel1.add(jitemname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 160, 31));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Products ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Products Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Category");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Supplier");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 80, 30));

        Jcategory.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        Jcategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fresh Produce", "Dairy", "Beverages", "Snacks", "Cleaning Supplies" }));
        Jcategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcategoryActionPerformed(evt);
            }
        });
        jPanel1.add(Jcategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 160, 31));

        jsupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsupplierActionPerformed(evt);
            }
        });
        jPanel1.add(jsupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 160, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Quantity");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Price");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 430, -1, -1));
        jPanel1.add(jquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 370, 160, 31));
        jPanel1.add(jprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 420, 160, 31));

        jButton1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton1.setText("Add Product");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, 220, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grocery_store_management_system/oop8.jpeg"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        LoginFrame L1 = new LoginFrame();
        L1.setVisible(true);

        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String selectedCategory = (String) jComboBox2.getSelectedItem();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        try (BufferedReader br = new BufferedReader(new FileReader("products.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                
                if (line.trim().isEmpty()) {
                    continue;
                }

               
                String[] fields = line.split(",");
                if (fields.length < 5) {
                    
                    System.err.println("Skipping malformed line: " + line);
                    continue;
                }

                String id = fields[0];
                String name = fields[1];
                String category = fields[2];
                String price = fields[3];
                String quantity = fields[4];

                if (category.equalsIgnoreCase(selectedCategory)) {
                    model.addRow(new Object[]{id, name, category, price, quantity});
                }
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error reading file: " + ex.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DefaultTableModel tbModel = (DefaultTableModel)jTable1.getModel();
        tbModel.setRowCount(0);

        try{
            BufferedReader reader = new BufferedReader(new FileReader("products.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                tbModel.addRow(data);
            }

            reader.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error loading data from file.");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void JcategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JcategoryActionPerformed

    private void jsupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsupplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jsupplierActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String id = jitemid.getText().trim();
        String name = jitemname.getText().trim();
        String category = Jcategory.getSelectedItem().toString();
        String supplier = jsupplier.getText().trim();
        String priceStr = jprice.getText().trim();
        String quantityStr = jquantity.getText().trim();

       
        if (id.isEmpty() || name.isEmpty() || supplier.isEmpty() ||
            priceStr.isEmpty() || quantityStr.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                "Please fill in all fields!",
                "Missing Information",
                JOptionPane.WARNING_MESSAGE);
            return;
        }

      
        if (!id.matches("^[A-Za-z0-9]+$")) {
            JOptionPane.showMessageDialog(this,
                "Product ID must be alphanumeric (letters and numbers only)!",
                "Invalid Product ID",
                JOptionPane.ERROR_MESSAGE);
            jitemid.requestFocus();
            return;
        }

      
        try {
            FileManager fileManager = new FileManager();
            java.util.List<Product> existingProducts = fileManager.loadProducts();

            for (Product product : existingProducts) {
                if (product.getId().equalsIgnoreCase(id)) {
                    JOptionPane.showMessageDialog(this,
                        "Product ID '" + id + "' already exists!\n" +
                        "Please use a unique Product ID.",
                        "Duplicate Product ID",
                        JOptionPane.WARNING_MESSAGE);
                    jitemid.selectAll();
                    jitemid.requestFocus();
                    return;
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this,
                "Error checking existing products: " + e.getMessage(),
                "File Error",
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        
        double price;
        try {
            price = Double.parseDouble(priceStr);
            if (price <= 0) {
                JOptionPane.showMessageDialog(this,
                    "Price must be greater than 0!",
                    "Invalid Price",
                    JOptionPane.ERROR_MESSAGE);
                jprice.selectAll();
                jprice.requestFocus();
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                "Price must be a valid number!\n" +
                "Example: 12.99, 5.50, 100.00",
                "Invalid Price Format",
                JOptionPane.ERROR_MESSAGE);
            jprice.selectAll();
            jprice.requestFocus();
            return;
        }

      
        int quantity;
        try {
            quantity = Integer.parseInt(quantityStr);
            if (quantity < 0) {
                JOptionPane.showMessageDialog(this,
                    "Quantity cannot be negative!",
                    "Invalid Quantity",
                    JOptionPane.ERROR_MESSAGE);
                jquantity.selectAll();
                jquantity.requestFocus();
                return;
            }

          
            if (quantity > 1000) {
                JOptionPane.showMessageDialog(this,
                    "Quantity is too high! Maximum allowed is 1000.",
                    "Quantity Limit Exceeded",
                    JOptionPane.WARNING_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                "Quantity must be a whole number!\n" +
                "Example: 50, 100, 25",
                "Invalid Quantity Format",
                JOptionPane.ERROR_MESSAGE);
            jquantity.selectAll();
            jquantity.requestFocus();
            return;
        }

       
        Product newProduct = new Product(id, name, category, supplier, price, quantity);

        
        try {
            FileManager fileManager = new FileManager();
            fileManager.saveProduct(newProduct);

           
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.addRow(new Object[]{
                newProduct.getId(),
                newProduct.getName(),
                newProduct.getCategory(),
                newProduct.getSupplier(),
                String.format("$%.2f", newProduct.getPrice()), 
                newProduct.getQuantity()
            });

          
            JOptionPane.showMessageDialog(this,
                "Product Added Successfully!\n\n" +
                "ID: " + id + "\n" +
                "Name: " + name + "\n" +
                "Category: " + category + "\n" +
                "Supplier: " + supplier + "\n" +
                "Price: $" + String.format("%.2f", price) + "\n" +
                "Quantity: " + quantity,
                "Success",
                JOptionPane.INFORMATION_MESSAGE);

         
            clearProductFields();

            
            jitemid.requestFocus();

        } catch (IOException e) {
            
            JOptionPane.showMessageDialog(this,
                "Error saving product to file!\n" +
                "Error: " + e.getMessage() + "\n\n" +
                "Please check if the products.txt file is accessible.",
                "Save Error",
                JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        }

       
        private void clearProductFields() {
            jitemid.setText("");
            jitemname.setText("");
            Jcategory.setSelectedIndex(0); 
            jsupplier.setText("");
            jprice.setText("");
            jquantity.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SalesAssistantFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesAssistantFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesAssistantFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesAssistantFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalesAssistantFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Jcategory;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jitemid;
    private javax.swing.JTextField jitemname;
    private javax.swing.JTextField jprice;
    private javax.swing.JTextField jquantity;
    private javax.swing.JTextField jsupplier;
    // End of variables declaration//GEN-END:variables
}
