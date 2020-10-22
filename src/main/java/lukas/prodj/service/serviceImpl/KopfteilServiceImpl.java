package lukas.prodj.service.serviceImpl;

import lukas.prodj.entity.KopfteilEntity;
import lukas.prodj.repository.KopfteilRepository;
import lukas.prodj.service.KopfteilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KopfteilServiceImpl implements KopfteilService {

    @Autowired
    private KopfteilRepository kopfteilRepository;

    @Override
    public List<KopfteilEntity> getKopfteils() {
        return kopfteilRepository.findAll();
    }

    @Override
    public void createKopfteil(KopfteilEntity kopfteil) {
        kopfteilRepository.save(kopfteil);
    }

    @Override
    public KopfteilEntity getKopfteil(Long id) {
        return kopfteilRepository.getOne(id);
    }

    @Override
    public void updateKopfteil(KopfteilEntity kopfteil) {
        kopfteilRepository.save(kopfteil);
    }

    @Override
    public void deleteKopfteil(Long id) {
        kopfteilRepository.deleteById(id);
    }
}
