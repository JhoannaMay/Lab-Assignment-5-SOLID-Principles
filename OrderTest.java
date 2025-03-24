// OrderTest.java
public class OrderTest {
    private Order order;
    private Invoice invoice;
    private Notification notification;


    public OrderTest(Order order, Invoice invoice, Notification notification) {
        this.order = order;
        this.invoice = invoice;
        this.notification = notification;
    }

    public void processOrder(double price, int quantity, String customerName, String address, String fileName, String email) {
        order.calculateTotal(price, quantity);
        order.placeOrder(customerName, address);
        invoice.generateInvoice(fileName);
        notification.sendEmailNotification(email);
    }

    public static void main(String[] args) {
        // Dependencies are injected here, which can be easily replaced with different implementations.
        Order order = new OrderAction();
        Invoice invoice = new InvoiceAction();
        Notification notification = new EmailNotification();

        OrderTest orderTest = new OrderTest(order, invoice, notification);
        orderTest.processOrder(10.0, 2, "John Doe", "123 Main St", "order_123.pdf", "johndoe@example.com");
    }
}
