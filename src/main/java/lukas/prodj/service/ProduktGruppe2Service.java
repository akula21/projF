package lukas.prodj.service;

import lukas.prodj.entity.ProduktGruppe2Entity;

import java.util.List;

public interface ProduktGruppe2Service {

    List<ProduktGruppe2Entity> getProduktGruppe2s();

    void createProduktGruppe2(ProduktGruppe2Entity produktGruppe2);

    ProduktGruppe2Entity getProduktGruppe2(Long id);

    void updateProduktGruppe2(ProduktGruppe2Entity produktGruppe2);

    void deleteProduktGruppe2(Long id);

    ProduktGruppe2Entity produktGruppe2 = new ProduktGruppe2Entity();
}
