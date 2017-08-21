package test.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import test.models.MscHuawei;
import test.repositories.MscHuaweiRepository;

import java.util.List;

@Service
@Primary
public class MscHuaweiServiceJpaImpl implements MscHuaweiService{
    @Autowired
    private MscHuaweiRepository mscHuaweiRepository;

    @Override
    public List<MscHuawei> findLatest4() {
        return this.mscHuaweiRepository.findLatest4MscHuawei();
    }

}
