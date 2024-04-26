/** 
 * 📝Defining a focused interface for order-related actions 
 * adhering to the Single Responsibility Principle.
 */

 public interface Order {

    void calculateTotal(double price, int quantity);
    void placeOrder(String customerName, String address);
}