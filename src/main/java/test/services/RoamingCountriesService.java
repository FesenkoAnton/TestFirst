package test.services;


import test.models.RoamingCountries;

import java.util.List;

public interface RoamingCountriesService {
    List<RoamingCountries> findLatest11();
}
