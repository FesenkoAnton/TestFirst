package test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import test.models.MscNsn;

import java.util.List;

@Repository
public interface MscNsnRepository extends
        JpaRepository<MscNsn, Long>

{
    @Query("SELECT p FROM MscNsn p ORDER BY p.id DESC")
    List<MscNsn> findLatest7MscNsn();
}

