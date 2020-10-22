package lukas.prodj.service;

import lukas.prodj.entity.ProduktGruppe1Entity;

import java.util.List;

public interface ProduktGruppe1Service {

    List<ProduktGruppe1Entity> getProduktGruppe1s();

    void createProduktGruppe1(ProduktGruppe1Entity produktGruppe1);

    ProduktGruppe1Entity getProduktGruppe1(Long id);

    void updateProduktGruppe1(ProduktGruppe1Entity produktGruppe1);

    void deleteProduktGruppe1(Long id);

    ProduktGruppe1Entity produktGruppe1 = new ProduktGruppe1Entity();
}
