package test.services;

import test.models.RoamingOperators;

import java.util.List;


public interface RoamingOperatorsService {
    List<RoamingOperators> findLatest14();
}
