package test.services;


import test.models.Top5OperatorsInAto;

import java.util.List;

public interface Top5OperatorsInAtoService {
    List<Top5OperatorsInAto> findLatest6();
}
