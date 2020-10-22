package lukas.prodj.service.serviceImpl;

import lukas.prodj.entity.KaefigDetailsEntity;
import lukas.prodj.repository.KaefigDetailsRepository;
import lukas.prodj.service.KaefigDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KaefigDetailsServiceImpl implements KaefigDetailsService {

    @Autowired
    private KaefigDetailsRepository kaefigDetailsRepository;

    @Override
    public List<KaefigDetailsEntity> getKaefigDetails() {
        return kaefigDetailsRepository.findAll();
    }

    @Override
    public void createKaefigDetail(KaefigDetailsEntity kaefigDetails) {
        kaefigDetailsRepository.save(kaefigDetails);
    }

    @Override
    public KaefigDetailsEntity getKaefigDetail(Long id) {
        return kaefigDetailsRepository.getOne(id);
    }

    @Override
    public void updateKaefigDetail(KaefigDetailsEntity kaefigDetails) {
        kaefigDetailsRepository.save(kaefigDetails);
    }

    @Override
    public void deleteKaefigDetail(Long id) {
        kaefigDetailsRepository.deleteById(id);
    }

}
