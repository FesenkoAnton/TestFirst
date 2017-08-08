package test.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import test.models.RoamingCountries;
import test.repositories.RoamingCountriesRepository;

import java.util.List;

@Service
@Primary
public class RoamingCountriesServiceJpaImpl implements RoamingCountriesService{
    @Autowired
    private RoamingCountriesRepository roamingCountriesRepository;

    @Override
    public List<RoamingCountries> findLatest11() {
        return this.roamingCountriesRepository.findLatest11RoamingCountries();
    }
}
