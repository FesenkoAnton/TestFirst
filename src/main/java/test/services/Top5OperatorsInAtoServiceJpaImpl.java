package test.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import test.models.Top5OperatorsInAto;
import test.repositories.Top5OperatorsAtoRepository;

import java.util.List;

@Service
@Primary
public class Top5OperatorsInAtoServiceJpaImpl implements Top5OperatorsInAtoService{
    @Autowired
    private Top5OperatorsAtoRepository top5OperatorsAtoRepository;

    public List<Top5OperatorsInAto> findLatest6() {
        return this.top5OperatorsAtoRepository.findLatest6Top5OperatorsInAto();
    }
}
