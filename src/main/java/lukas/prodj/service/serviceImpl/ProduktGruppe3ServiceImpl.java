package lukas.prodj.service.serviceImpl;

import lukas.prodj.entity.ProduktGruppe3Entity;
import lukas.prodj.repository.ProduktGruppe3Repository;
import lukas.prodj.service.ProduktGruppe3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduktGruppe3ServiceImpl implements ProduktGruppe3Service {

    @Autowired
    private ProduktGruppe3Repository produktGruppe3Repository;

    @Override
    public List<ProduktGruppe3Entity> getProduktGruppe3s() {
        return produktGruppe3Repository.findAll();
    }

    @Override
    public void createProduktGruppe3(ProduktGruppe3Entity produktGruppe3) {
        produktGruppe3Repository.save(produktGruppe3);
    }

    @Override
    public ProduktGruppe3Entity getProduktGruppe3(Long id) {
        return produktGruppe3Repository.getOne(id);
    }

    @Override
    public void updateProduktGruppe3(ProduktGruppe3Entity produktGruppe3) {
        produktGruppe3Repository.save(produktGruppe3);
    }

    @Override
    public void deleteProduktGruppe3(Long id) {
        produktGruppe3Repository.deleteById(id);
    }
}
