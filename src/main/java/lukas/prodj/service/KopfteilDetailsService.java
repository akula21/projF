package lukas.prodj.service;

import lukas.prodj.entity.KopfteilDetailsEntity;

import java.util.List;

public interface KopfteilDetailsService {

    List<KopfteilDetailsEntity> getKopfteilDetails();

    void createKopfteilDetail(KopfteilDetailsEntity kopfteilDetail);

    KopfteilDetailsEntity getKopfteilDetail(Long id);

    void updateKopfteilDetail(KopfteilDetailsEntity kopfteilDetail);

    void deleteKopfteilDetail(Long id);

    KopfteilDetailsEntity kopfteilDetail = new KopfteilDetailsEntity();
}
