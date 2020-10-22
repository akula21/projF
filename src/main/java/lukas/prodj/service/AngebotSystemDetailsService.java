package lukas.prodj.service;

import lukas.prodj.entity.AngebotSystemDetailsEntity;

import java.util.List;

public interface AngebotSystemDetailsService {

    List<AngebotSystemDetailsEntity> getAngebotSystemDetails();

    void createAngebotSystemDetail(AngebotSystemDetailsEntity angebotSystemDetail);

    AngebotSystemDetailsEntity getAngebotSystemDetail(Long id);

    void updateAngebotSystemDetail(AngebotSystemDetailsEntity angebotSystemDetail);

    void deleteAngebotSystemDetail(Long id);

    AngebotSystemDetailsEntity angebotSystemDetail = new AngebotSystemDetailsEntity();
}
