package lukas.prodj.service;

import lukas.prodj.entity.KaefigEntity;

import java.util.List;

public interface KaefigService {

    List<KaefigEntity> getKaefigs();

    void createKaefig(KaefigEntity kaefig);

    KaefigEntity getKaefig(Long id);

    void updateKaefig(KaefigEntity kaefig);

    void deleteKaefig(Long id);

    KaefigEntity kaefig = new KaefigEntity();
}
