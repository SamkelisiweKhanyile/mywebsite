package za.co.shinysneakers.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import za.co.shinysneakers.domain.HomeAddress;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class HomeAddressRepositoryTest {

    @Autowired
    private HomeAddressRepository repository;

    @Test
    void saveAddress_success() {
        HomeAddress address = new HomeAddress.Builder()
                .streetNumber("24")
                .streetName("Sunset Blvd")
                .suburb("D. North")
                .city("Durban")
                .provice("KZN")
                .country("South Africa")
                .postalCode(3302)
                .build();

        HomeAddress saved = repository.save(address);
        assertNotNull(saved);
        assertEquals("Sunset Blvd", saved.getStreetName());
    }

    @Test
    void deleteAddress_success() {
        HomeAddress address = new HomeAddress.Builder()
                .streetNumber("22")
                .streetName("Main Rd")
                .suburb("Dankop")
                .city("Stanger")
                .provice("KZN")
                .country("South Africa")
                .postalCode(4450)
                .build();

        HomeAddress saved = repository.save(address);
        repository.delete(saved);

        assertFalse(repository.findById(saved.getAddressId()).isPresent());
    }
}

