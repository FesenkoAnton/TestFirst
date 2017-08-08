package test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import test.models.RoamingAllSubscribers;

import java.util.List;

public interface RoamingAllSubscribersRepository extends JpaRepository<RoamingAllSubscribers,Long>

{
    @Query("SELECT p FROM RoamingAllSubscribers p ORDER BY p.id DESC")
    List<RoamingAllSubscribers> findLatest1RoamingAllSubscribers();
}

