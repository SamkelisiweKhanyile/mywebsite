package za.co.shinysneakers.Service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import za.co.shinysneakers.domain.Customer;
import za.co.shinysneakers.repository.CustomerRepository;


import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class ICustomerServiceTest {
    private CustomerRepository repository;
    private ICustomerService service;
    private Customer customer;

    @BeforeEach
    void setUp() {
        repository = Mockito.mock(CustomerRepository.class);
        service = new CustomerService(repository);

        customer = new Customer.Builder()
                .setCustomerId("y44")
                .setFirstName("Sitha")
                .setLastName("Khanyile")
                .setEmail("samsitha01@gmail.com")
                .setMobile("0721234567")
                .build();
    }

    @Test
    void testCreate() {
        when(repository.save(customer)).thenReturn(customer);
        Customer created = service.create(customer);
        assertNotNull(created);
        assertEquals("y44", created.getCustomerId());
    }
    @Test
    void testRead() {
        when(repository.findById("z980")).thenReturn(Optional.of(customer));
        Optional<Customer> found = service.read("z980");
        assertTrue(found.isPresent());
        assertEquals("Sitha", found.get().getFirstName());
    }
    @Test
    void testUpdate() {
        when(repository.existsById("z980")).thenReturn(true);
        when(repository.save(customer)).thenReturn(customer);
        Customer updated = service.update(customer);
        assertNotNull(updated);
    }
    @Test
    void testDelete() {
        doNothing().when(repository).deleteById("z980");
        service.delete("z980");
        verify(repository, times(1)).deleteById("z980");
    }
    @Test
    void testGetAll() {
        when(repository.findAll()).thenReturn(List.of(customer));
        List<Customer> list = service.getAll();
        assertEquals(1, list.size());
    }
}

