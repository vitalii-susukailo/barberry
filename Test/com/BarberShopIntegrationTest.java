public class BarberShopIntegrationTest {

    // Test the integration between addCustomer and getCustomerCount methods
    @Test
    public void testAddCustomerAndGetCustomerCount() {
        BarberShop shop = new BarberShop();
        Customer customer = new Customer("John Smith", 30);
        shop.addCustomer(customer);
        int customerCount = shop.getCustomerCount();
        assertEquals(1, customerCount);
    }

    // Test the integration between addCustomer and getNextCustomer methods
    @Test
    public void testAddCustomerAndGetNextCustomer() {
        BarberShop shop = new BarberShop();
        Customer customer1 = new Customer("John Smith", 30);
        Customer customer2 = new Customer("Jane Doe", 25);
        shop.addCustomer(customer1);
        shop.addCustomer(customer2);
        Customer nextCustomer = shop.getNextCustomer();
        assertEquals(customer1, nextCustomer);
    }
}
