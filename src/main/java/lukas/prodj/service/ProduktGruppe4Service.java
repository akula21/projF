package lukas.prodj.service;

import lukas.prodj.entity.ProduktGruppe4Entity;

import java.util.List;

public interface ProduktGruppe4Service {

    List<ProduktGruppe4Entity> getProduktGruppe4s();

    void createProduktGruppe4(ProduktGruppe4Entity produktGruppe4);

    ProduktGruppe4Entity getProduktGruppe4(Long id);

    void updateProduktGruppe4(ProduktGruppe4Entity produktGruppe4);

    void deleteProduktGruppe4(Long id);

    ProduktGruppe4Entity produktGruppe4 = new ProduktGruppe4Entity();
}
