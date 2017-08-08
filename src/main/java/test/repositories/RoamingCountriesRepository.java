package test.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import test.models.RoamingCountries;

import java.util.List;

public interface RoamingCountriesRepository extends JpaRepository<RoamingCountries,Long> {
    @Query("SELECT p FROM RoamingCountries p ORDER BY p.id DESC")
    List<RoamingCountries> findLatest11RoamingCountries();
}
