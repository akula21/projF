package lukas.prodj.service.serviceImpl;

import lukas.prodj.entity.ProduktGruppe4Entity;
import lukas.prodj.repository.ProduktGruppe4Repository;
import lukas.prodj.service.ProduktGruppe4Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduktGruppe4ServiceImpl implements ProduktGruppe4Service {

    @Autowired
    private ProduktGruppe4Repository produktGruppe4Repository;

    @Override
    public List<ProduktGruppe4Entity> getProduktGruppe4s() {
        return produktGruppe4Repository.findAll();
    }

    @Override
    public void createProduktGruppe4(ProduktGruppe4Entity produktGruppe4) {
        produktGruppe4Repository.save(produktGruppe4);
    }

    @Override
    public ProduktGruppe4Entity getProduktGruppe4(Long id) {
        return produktGruppe4Repository.getOne(id);
    }

    @Override
    public void updateProduktGruppe4(ProduktGruppe4Entity produktGruppe4) {
        produktGruppe4Repository.save(produktGruppe4);
    }

    @Override
    public void deleteProduktGruppe4(Long id) {
        produktGruppe4Repository.deleteById(id);
    }
}
