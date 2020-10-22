package lukas.prodj.service.serviceImpl;

import lukas.prodj.entity.ProduktGruppe1Entity;
import lukas.prodj.repository.ProduktGruppe1Repository;
import lukas.prodj.service.ProduktGruppe1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduktGruppe1ServiceImpl implements ProduktGruppe1Service {

    @Autowired
    private ProduktGruppe1Repository produktGruppe1Repository;

    @Override
    public List<ProduktGruppe1Entity> getProduktGruppe1s() {
        return produktGruppe1Repository.findAll();
    }

    @Override
    public void createProduktGruppe1(ProduktGruppe1Entity produktGruppe1) {
        produktGruppe1Repository.save(produktGruppe1);
    }

    @Override
    public ProduktGruppe1Entity getProduktGruppe1(Long id) {
        return produktGruppe1Repository.getOne(id);
    }

    @Override
    public void updateProduktGruppe1(ProduktGruppe1Entity produktGruppe1) {
        produktGruppe1Repository.save(produktGruppe1);
    }

    @Override
    public void deleteProduktGruppe1(Long id) {
        produktGruppe1Repository.deleteById(id);
    }
}
