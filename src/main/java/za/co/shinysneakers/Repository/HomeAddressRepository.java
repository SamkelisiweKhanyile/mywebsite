package za.co.shinysneakers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.shinysneakers.domain.HomeAddress;
import java.util.List;

@Repository
public interface HomeAddressRepository extends JpaRepository<HomeAddress, Long> {

    List<HomeAddress> findAll();
