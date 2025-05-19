package za.co.shinysneakers.factory;

import org.junit.jupiter.api.Test;
import za.co.shinysneakers.domain.Customer;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerFactoryTest {

    @Test
    void createCustomer_success() {
        Customer customer = CustomerFactory.createCustomer("Sitha", "Khanyile", "samkestha01@gmail.com", "0721234567");
        assertNotNull(customer);
        assertEquals("Sitha", customer.getFirstName());
    }

    @Test
    void createCustomer_fail_dueToEmptyFields() {
        Customer customer = CustomerFactory.createCustomer("", "Khanyile", "samkestha01@gmail.com", "0721234567");
        assertNull(customer);
    }
}
