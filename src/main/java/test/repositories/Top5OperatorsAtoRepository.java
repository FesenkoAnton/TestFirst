package test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import test.models.Top5OperatorsInAto;

import java.util.List;

@Repository
public interface Top5OperatorsAtoRepository extends
        JpaRepository<Top5OperatorsInAto, Long> {
    @Query("SELECT p FROM Top5OperatorsInAto p ORDER BY p.id DESC")
    List<Top5OperatorsInAto> findLatest6Top5OperatorsInAto();
}
