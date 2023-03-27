import org.junit.Test;
import static org.junit.Assert.*;

public class BarberShopTest {

    @Test
    public void testAddCustomer() {
        BarberShop barberShop = new BarberShop();
        Customer customer = new Customer("John");
        barberShop.addCustomer(customer);
        assertEquals(1, barberShop.getCustomerCount());
    }

    @Test
    public void testRemoveCustomer() {
        BarberShop barberShop = new BarberShop();
        Customer customer = new Customer("John");
        barberShop.addCustomer(customer);
        barberShop.removeCustomer(customer);
        assertEquals(0, barberShop.getCustomerCount());
    }

    @Test
    public void testGetCustomerCount() {
        BarberShop barberShop = new BarberShop();
        assertEquals(0, barberShop.getCustomerCount());
        Customer customer1 = new Customer("John");
        barberShop.addCustomer(customer1);
        assertEquals(1, barberShop.getCustomerCount());
        Customer customer2 = new Customer("Jane");
        barberShop.addCustomer(customer2);
        assertEquals(2, barberShop.getCustomerCount());
    }

    @Test
    public void testGetNextCustomer() {
        BarberShop barberShop = new BarberShop();
        assertNull(barberShop.getNextCustomer());
        Customer customer1 = new Customer("John");
        barberShop.addCustomer(customer1);
        assertEquals(customer1, barberShop.getNextCustomer());
        Customer customer2 = new Customer("Jane");
        barberShop.addCustomer(customer2);
        assertEquals(customer1, barberShop.getNextCustomer());
        barberShop.removeCustomer(customer1);
        assertEquals(customer2, barberShop.getNextCustomer());
    }
}