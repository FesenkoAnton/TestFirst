package test.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import test.models.RoamingOperators;
import test.repositories.RoamingOperatorsRepository;

import java.util.List;

@Service
@Primary
public class RoamingOperatorsServiceJpaImpl implements RoamingOperatorsService{

    @Autowired
    private RoamingOperatorsRepository roamingOperatorsRepository;

    @Override
    public List<RoamingOperators> findLatest14() {
        return this.roamingOperatorsRepository.findLatest14RoamingOperators();
    }
}
