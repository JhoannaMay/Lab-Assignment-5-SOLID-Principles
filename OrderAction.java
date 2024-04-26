/** 
 * 📝This class is responsible only for order-related actions, 
 * following the Single Responsibility Principle.
 */

 public class OrderAction implements Order {

    @Override
    public void calculateTotal(double price, int quantity) {

        double total = price * quantity;
        System.out.println("Order total: $" + total);
    }

    @Override
    public void placeOrder(String customerName, String address) {
        
        System.out.println("Order placed for " + customerName + " at " + address);
    }
}