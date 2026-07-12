package grocery_store_management_system;

public abstract class UserRole {
    protected User user;
    
    public UserRole(User user) {
        this.user = user;
    }
    
    public abstract void loginAction();
}