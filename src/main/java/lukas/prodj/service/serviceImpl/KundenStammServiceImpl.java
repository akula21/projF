package lukas.prodj.service.serviceImpl;

import lukas.prodj.entity.KundenStammEntity;
import lukas.prodj.repository.KundenStammRepository;
import lukas.prodj.service.KundenStammService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KundenStammServiceImpl implements KundenStammService {

    @Autowired
    private KundenStammRepository kundenStammRepository;

    @Override
    public List<KundenStammEntity> getKundens() {
        return kundenStammRepository.findAll();
    }

    @Override
    public void createKunden(KundenStammEntity kundenStamm) {
        kundenStammRepository.save(kundenStamm);
    }

    @Override
    public KundenStammEntity getKunden(Long id){
        return kundenStammRepository.getOne(id);
    }

    @Override
    public void updateKunden(KundenStammEntity kundenStamm){
        kundenStammRepository.save(kundenStamm);
    }

    @Override
    public void deleteKunden(Long id){
        kundenStammRepository.deleteById(id);
    }
}
