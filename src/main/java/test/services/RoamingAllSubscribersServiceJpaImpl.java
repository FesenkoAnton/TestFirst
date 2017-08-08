package test.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import test.models.RoamingAllSubscribers;
import test.repositories.RoamingAllSubscribersRepository;

import java.util.List;

@Service
@Primary
public class RoamingAllSubscribersServiceJpaImpl implements RoamingAllSubsribersService {

    @Autowired
    private RoamingAllSubscribersRepository roamingAllSubscribersRepository;

    @Override
    public List<RoamingAllSubscribers> findLatest1() {
        return this.roamingAllSubscribersRepository.findLatest1RoamingAllSubscribers();
    }


}

