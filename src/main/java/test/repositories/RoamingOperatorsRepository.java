package test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import test.models.RoamingOperators;

import java.util.List;

@Repository
public interface RoamingOperatorsRepository extends
        JpaRepository<RoamingOperators, Long> {
    @Query("SELECT p FROM RoamingOperators p ORDER BY p.id DESC")
    List<RoamingOperators> findLatest14RoamingOperators();
}
