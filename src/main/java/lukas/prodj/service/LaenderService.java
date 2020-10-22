package lukas.prodj.service;

import lukas.prodj.entity.LaenderEntity;

import java.util.List;

public interface LaenderService {

    List<LaenderEntity> getLaenders();

    void createLaender(LaenderEntity laender);

    LaenderEntity getLaender(Long id);

    void updateLaender(LaenderEntity laender);

    void deleteLaender(Long id);

    LaenderEntity laender = new LaenderEntity();
}
