package test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import test.models.MscHuawei;

import java.util.List;

@Repository
public interface MscHuaweiRepository extends
        JpaRepository<MscHuawei, Long> {
    @Query("SELECT p FROM MscHuawei p ORDER BY p.id DESC")
    List<MscHuawei> findLatest4MscHuawei();
}

