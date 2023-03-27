package BarberShop;
import java.util.LinkedList;
import java.util.Queue;

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
}
