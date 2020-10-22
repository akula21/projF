package lukas.prodj.service;

import lukas.prodj.entity.KaefigDetailsEntity;

import java.util.List;

public interface KaefigDetailsService {

    List<KaefigDetailsEntity> getKaefigDetails();

    void createKaefigDetail(KaefigDetailsEntity kaefigDetails);

    KaefigDetailsEntity getKaefigDetail(Long id);

    void updateKaefigDetail(KaefigDetailsEntity kaefigDetails);

    void deleteKaefigDetail(Long id);

    KaefigDetailsEntity kaefigDetail = new KaefigDetailsEntity();
}
