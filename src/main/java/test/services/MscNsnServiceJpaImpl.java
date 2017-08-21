package test.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import test.models.MscNsn;
import test.repositories.MscNsnRepository;

import java.util.List;

@Service
@Primary
public class MscNsnServiceJpaImpl implements MscNsnService{

    @Autowired
    private MscNsnRepository mscNsnRepository;

    @Override
    public List<MscNsn> findLatest7() {
        return this.mscNsnRepository.findLatest7MscNsn();
    }

}
