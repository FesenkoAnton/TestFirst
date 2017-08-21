package test.services;

import test.models.MscNsn;

import java.util.List;

public interface MscNsnService {
    List<MscNsn> findLatest7();
}
