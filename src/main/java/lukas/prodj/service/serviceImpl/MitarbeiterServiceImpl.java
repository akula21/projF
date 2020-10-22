package lukas.prodj.service.serviceImpl;

import lukas.prodj.entity.MitarbeiterEntity;
import lukas.prodj.repository.MitarbeiterRepository;
import lukas.prodj.service.MitarbeiterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MitarbeiterServiceImpl implements MitarbeiterService {

    @Autowired
    private MitarbeiterRepository mitarbeiterRepository;

    @Override
    public List<MitarbeiterEntity> getMitarbeiters(){
        return mitarbeiterRepository.findAll();
    }

    @Override
    public void createMitarbeiter(MitarbeiterEntity mitarbeiter) {
        mitarbeiterRepository.save(mitarbeiter);
    }

    @Override
    public MitarbeiterEntity getMitarbeiter(Long id) {
        return mitarbeiterRepository.getOne(id);
    }

    @Override
    public void updateMitarbeiter(MitarbeiterEntity mitarbeiter){
        mitarbeiterRepository.save(mitarbeiter);
    }

    @Override
    public void deleteMitarbeiter(Long id) {
        mitarbeiterRepository.deleteById(id);
    }
}
