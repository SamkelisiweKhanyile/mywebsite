package za.co.shinysneakers.factory;

import org.junit.jupiter.api.Test;
import za.co.shinysneakers.domain.HomeAddress;

import static org.junit.jupiter.api.Assertions.*;

public class HomeAddressFactoryTest {

    @Test
    void createAddress_success() {
        HomeAddress address = HomeAddressFactory.createHomeAddress("22", "Main Rd", "Dankop",
                "Stanger", "KZN", "South Africa", 4450);
        assertNotNull(address);
        assertEquals("Sikelela Rd", address.getStreetName());
    }

    @Test
    void createAddress_fail_dueToMissingFields() {
        HomeAddress address = HomeAddressFactory.createHomeAddress("", "Sikelela Rd", "Newlands",
                "Cape Town", "Western Cape", "South Africa", 8001);
        assertNull(address);
    }
}

