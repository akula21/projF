package lukas.prodj.service;

import lukas.prodj.entity.VerkaufsArtikelEntity;

import java.util.List;

public interface VerkaufsArtikelService {

    List<VerkaufsArtikelEntity> getVerkaufsArtikels();

    void createVerkaufsArtikel(VerkaufsArtikelEntity verkaufsArtikel);

    VerkaufsArtikelEntity getVerkaufsArtikel(Long id);

    void updateVerkaufsArtikel(VerkaufsArtikelEntity verkaufsArtikel);

    void deleteVerkaufsArtikel(Long id);

    VerkaufsArtikelEntity verkaufsArtikel = new VerkaufsArtikelEntity();
}
