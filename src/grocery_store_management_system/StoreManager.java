package grocery_store_management_system;

public class StoreManager extends UserRole {
    public StoreManager(User user) {
        super(user);
    }
    
    @Override
    public void loginAction() {
        StoreManagerFrame frame = new StoreManagerFrame();
        frame.setVisible(true);
    }
}