package grocery_store_management_system;

import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;

public class UserManager {
    private FileManager fileManager;
    
    public UserManager() {
        this.fileManager = new FileManager();
    }
    
    public User authenticateUser(String username, String password) {
        try {
            List<User> users = fileManager.loadUsers();
            for (User user : users) {
                if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                    return user;
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error accessing user database: " + e.getMessage());
        }
        return null;
    }
    
    public boolean createUser(String username, String password, String role) {
        try {
            List<User> users = fileManager.loadUsers();
            
            
            for (User user : users) {
                if (user.getUsername().equals(username)) {
                    JOptionPane.showMessageDialog(null, "Username already exists!");
                    return false;
                }
            }
            
           
            User newUser = new User(username, password, role);
            fileManager.saveUser(newUser);
            return true;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error creating user: " + e.getMessage());
            return false;
        }
    }
}