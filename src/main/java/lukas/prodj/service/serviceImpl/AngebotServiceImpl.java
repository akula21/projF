package lukas.prodj.service.serviceImpl;

import lukas.prodj.entity.AngebotEntity;
import lukas.prodj.repository.AngebotRepository;
import lukas.prodj.service.AngebotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AngebotServiceImpl implements AngebotService {

    @Autowired
    private AngebotRepository angebotRepository;

    @Override
    public List<AngebotEntity> getAngebots() {
        return angebotRepository.findAll();
    }

    @Override
    public void createAngebot(AngebotEntity angebot) {
        angebotRepository.save(angebot);
    }

    @Override
    public AngebotEntity getAngebot(Long id) {
        return angebotRepository.getOne(id);
    }

    @Override
    public void updateAngebot(AngebotEntity angebot) {
        angebotRepository.save(angebot);
    }

    @Override
    public void deleteAngebot(Long id) {
        angebotRepository.deleteById(id);
    }
}
