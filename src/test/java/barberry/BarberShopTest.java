package barberry;

import org.junit.Test;
import static org.junit.Assert.*;

public class BarberShopTest {

    // As a first step we created unit tests

    @Test

    // Tests the addCustomer() method of the BarberShop class. It creates a new BarberShop instance, adds a new Customer instance, and then checks that the customer count is incremented by 1.

    public void testAddCustomer() {
        BarberShop barberShop = new BarberShop();
        Customer customer = new Customer("Vitalii");
        barberShop.addCustomer(customer);
        assertEquals(1, barberShop.getCustomerCount());
    }

    @Test

    //Tests the removeCustomer() method of the BarberShop class. It creates a new BarberShop instance, adds a new Customer instance, removes the same Customer instance, and then checks that the customer count is decremented back to 0.
    
    public void testRemoveCustomer() {
        BarberShop barberShop = new BarberShop();
        Customer customer = new Customer("Vitalii");
        barberShop.addCustomer(customer);
        barberShop.removeCustomer(customer);
        assertEquals(0, barberShop.getCustomerCount());
    }

    @Test

    // Tests the getCustomerCount() method of the BarberShop class. It creates a new BarberShop instance and checks that the initial customer count is 0. It then adds two new Customer instances and checks that the customer count is incremented by 2.

    public void testGetCustomerCount() {
        BarberShop barberShop = new BarberShop();
        assertEquals(0, barberShop.getCustomerCount());
        Customer customer1 = new Customer("Vitalii");
        barberShop.addCustomer(customer1);
        assertEquals(1, barberShop.getCustomerCount());
        Customer customer2 = new Customer("Omid");
        barberShop.addCustomer(customer2);
        assertEquals(2, barberShop.getCustomerCount());
    }

    @Test

    //Tests the getNextCustomer() method of the BarberShop class. It creates a new BarberShop instance and checks that the initial next customer is null. It then adds two new Customer instances and checks that the first added customer is the next customer. It then removes the first customer and checks that the second customer is the next customer.

    public void testGetNextCustomer() {
        BarberShop barberShop = new BarberShop();
        assertNull(barberShop.getNextCustomer());
        Customer customer1 = new Customer("Vitalii");
        barberShop.addCustomer(customer1);
        assertEquals(customer1, barberShop.getNextCustomer());
        Customer customer2 = new Customer("Omid");
        barberShop.addCustomer(customer2);
        assertEquals(customer1, barberShop.getNextCustomer());
        barberShop.removeCustomer(customer1);
        assertEquals(customer2, barberShop.getNextCustomer());
    }
}