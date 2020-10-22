package lukas.prodj.service;

import lukas.prodj.entity.KopfteilEntity;

import java.util.List;

public interface KopfteilService {

    List<KopfteilEntity> getKopfteils();

    void createKopfteil(KopfteilEntity kopfteil);

    KopfteilEntity getKopfteil(Long id);

    void updateKopfteil(KopfteilEntity kopfteil);

    void deleteKopfteil(Long id);

    KopfteilEntity kopfteil = new KopfteilEntity();
}
