package lukas.prodj.service.serviceImpl;

import lukas.prodj.entity.KaefigEntity;
import lukas.prodj.repository.KaefigRepository;
import lukas.prodj.service.KaefigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KaefigServiceImpl implements KaefigService {

    @Autowired
    private KaefigRepository kaefigRepository;

    @Override
    public List<KaefigEntity> getKaefigs() {
        return kaefigRepository.findAll();
    }

    @Override
    public void createKaefig(KaefigEntity kaefig) {
        kaefigRepository.save(kaefig);
    }

    @Override
    public KaefigEntity getKaefig(Long id) {
        return kaefigRepository.getOne(id);
    }

    @Override
    public void updateKaefig(KaefigEntity kaefig) {
        kaefigRepository.save(kaefig);
    }

    @Override
    public void deleteKaefig(Long id) {
        kaefigRepository.deleteById(id);
    }
}
