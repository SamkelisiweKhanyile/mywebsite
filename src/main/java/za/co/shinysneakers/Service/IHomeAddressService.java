package za.co.shinysneakers.Service;

import za.co.shinysneakers.domain.HomeAddress;
import java.util.List;
import java.util.Optional;

public interface IHomeAddressService {
    HomeAddress create(HomeAddress address);
    Optional<HomeAddress> read(Long id);
    HomeAddress update(HomeAddress address);
    void delete(Long id);
    List<HomeAddress> getAll();
}
