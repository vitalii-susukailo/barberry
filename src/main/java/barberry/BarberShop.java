package barberry;
import java.util.LinkedList;
import java.util.Queue;
import barberry.Customer;

public class BarberShop {

    private Queue<Customer> customerQueue = new LinkedList<>();

    public void addCustomer(Customer customer) {
        customerQueue.add(customer);
    }

    public void removeCustomer(Customer customer) {
        customerQueue.remove(customer);
    }

    public int getCustomerCount() {
        return customerQueue.size();
    }

    public Customer getNextCustomer() {
        return customerQueue.peek();
    }

    public static void main(String[] args) {
        BarberShop barberShop = new BarberShop();
        Customer customer1 = new Customer("John");
        Customer customer2 = new Customer("Jane");
        barberShop.addCustomer(customer1);
        barberShop.addCustomer(customer2);
        System.out.println("Number of customers in the queue: " + barberShop.getCustomerCount());
        Customer nextCustomer = barberShop.getNextCustomer();
        if (nextCustomer != null) {
            System.out.println("Next customer in the queue: " + nextCustomer.getName());
        } else {
            System.out.println("No customers in the queue");
        }
    }
}
