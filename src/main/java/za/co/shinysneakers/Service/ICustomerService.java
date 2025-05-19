package za.co.shinysneakers.Service;

import za.co.shinysneakers.domain.Customer;
import java.util.List;
import java.util.Optional;

public interface ICustomerService {
    Customer create(Customer customer);
    Optional<Customer> read(String customerId);
    Customer update(Customer customer);
    void delete(String customerId);
    List<Customer> getAll();
}
