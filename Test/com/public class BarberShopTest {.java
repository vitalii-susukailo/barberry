public class BarberShopTest {
    
    // Test the addCustomer method
    @Test
    public void testAddCustomer() {
        BarberShop shop = new BarberShop();
        Customer customer = new Customer("John Smith", 30);
        shop.addCustomer(customer);
        assertEquals(1, shop.getCustomerCount());
    }
    
    // Test the removeCustomer method
    @Test
    public void testRemoveCustomer() {
        BarberShop shop = new BarberShop();
        Customer customer = new Customer("John Smith", 30);
        shop.addCustomer(customer);
        shop.removeCustomer(customer);
        assertEquals(0, shop.getCustomerCount());
    }
}