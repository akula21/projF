package lukas.prodj.service.serviceImpl;

import lukas.prodj.entity.ProduktGruppe2Entity;
import lukas.prodj.repository.ProduktGruppe2Repository;
import lukas.prodj.service.ProduktGruppe2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduktGruppe2ServiceImpl implements ProduktGruppe2Service {

    @Autowired
    private ProduktGruppe2Repository produktGruppe2Repository;

    @Override
    public List<ProduktGruppe2Entity> getProduktGruppe2s() {
        return produktGruppe2Repository.findAll();
    }

    @Override
    public void createProduktGruppe2(ProduktGruppe2Entity produktGruppe2) {
        produktGruppe2Repository.save(produktGruppe2);
    }

    @Override
    public ProduktGruppe2Entity getProduktGruppe2(Long id) {
        return produktGruppe2Repository.getOne(id);
    }

    @Override
    public void updateProduktGruppe2(ProduktGruppe2Entity produktGruppe2) {
        produktGruppe2Repository.save(produktGruppe2);
    }

    @Override
    public void deleteProduktGruppe2(Long id) {
        produktGruppe2Repository.deleteById(id);
    }
}
