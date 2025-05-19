package za.co.shinysneakers.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import za.co.shinysneakers.domain.Customer;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository repository;

    @Test
    void saveCustomer_success() {
        Customer customer = new Customer.Builder()
                .setCustomerId("z980")
                .setFirstName("Sitha")
                .setLastName("Khanyile")
                .setEmail("samkestha01@gmail.co")
                .setMobile("0721234567")
                .build();

        Customer saved = repository.save(customer);
        assertNotNull(saved);
        assertEquals("z980", saved.getCustomerId());
    }

    @Test
    void deleteCustomer_success() {
        Customer customer = new Customer.Builder()
                .setCustomerId("z353")
                .setFirstName("Sethu")
                .setLastName("Zulu")
                .setEmail("sethuzulu25@gmail.com")
                .setMobile("0812345678")
                .build();

        repository.save(customer);
        repository.deleteById("z353");

        assertFalse(repository.findById("z353").isPresent());
    }
}
