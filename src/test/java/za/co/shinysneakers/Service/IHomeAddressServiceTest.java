package za.co.shinysneakers.Service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.co.shinysneakers.domain.HomeAddress;
import za.co.shinysneakers.repository.HomeAddressRepository;
import java.util.List;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;

public class IHomeAddressServiceTest {

    private HomeAddressRepository repository;
    private IHomeAddressService service;

    private HomeAddress address;

    @BeforeEach
    void setUp() {
        repository = Mockito.mock(HomeAddressRepository.class);
        service = new HomeAddressServiceImpl(repository); // Using interface type

        HomeAddress address = new HomeAddress.Builder()
                .streetNumber("24")
                .streetName("Sunset Blvd")
                .suburb("D. North")
                .city("Durban")
                .provice("KZN")
                .country("South Africa")
                .postalCode(3302)
                .build();
    }

    @Test
    void testCreate() {
        when(repository.save(address)).thenReturn(address);
        HomeAddress saved = service.create(address);
        assertNotNull(saved);
        assertEquals("Main Rd", saved.getStreetName());
    }

    @Test
    void testRead() {
        when(repository.findById(1L)).thenReturn(Optional.of(address));
        Optional<HomeAddress> result = service.read(1L);
        assertTrue(result.isPresent());
        assertEquals("Dankop", result.get().getSuburb());
    }

    @Test
    void testUpdate() {
        when(repository.existsById(address.getAddressId())).thenReturn(true);
        when(repository.save(address)).thenReturn(address);

        HomeAddress updated = service.update(address);
        assertNotNull(updated);
        assertEquals("Durban", updated.getCity());
    }

    @Test
    void testDelete() {
        doNothing().when(repository).deleteById(1L);
        service.delete(1L);
        verify(repository, times(1)).deleteById(1L);
    }

    @Test
    void testGetAll() {
        when(repository.findAll()).thenReturn(List.of(address));
        List<HomeAddress> list = service.getAll();
        assertEquals(1, list.size());
    }
}
