package grocery_store_management_system;

public class SalesAssistant extends UserRole {
    public SalesAssistant(User user) {
        super(user);
    }
    
    @Override
    public void loginAction() {
        SalesAssistantFrame frame = new SalesAssistantFrame();
        frame.setVisible(true);
    }
}