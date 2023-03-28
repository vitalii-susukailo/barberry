package barberry;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

// Adding Integration tests we created.

public class BarberShopIntegrationTest {
      // Test the integration between addCustomer and getCustomerCount methods
    
      @Test
      public void testAddCustomerAndGetCustomerCount() {
          BarberShop shop = new BarberShop();
          Customer customer = new Customer("John Smith");
          shop.addCustomer(customer);
          int customerCount = shop.getCustomerCount();
          assertEquals(1, customerCount);
      }
  
      // Test the integration between addCustomer and getNextCustomer methods
      
      @Test
      public void testAddCustomerAndGetNextCustomer() {
          BarberShop shop = new BarberShop();
          Customer customer1 = new Customer("John Smith");
          Customer customer2 = new Customer("Jane Doe");
          shop.addCustomer(customer1);
          shop.addCustomer(customer2);
          Customer nextCustomer = shop.getNextCustomer();
          assertEquals(customer1, nextCustomer);
      }
}
