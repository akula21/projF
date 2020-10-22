package lukas.prodj.service.serviceImpl;

import lukas.prodj.entity.VerkaufsArtikelDetailsEntity;
import lukas.prodj.repository.VerkaufsArtikelDetailsRepository;
import lukas.prodj.service.VerkaufsArtikelDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VerkaufsArtikelDetailsServiceImpl implements VerkaufsArtikelDetailsService {

    @Autowired
    private VerkaufsArtikelDetailsRepository verkaufsArtikelDetailsRepository;

    @Override
    public List<VerkaufsArtikelDetailsEntity> getVerkaufsArtikelDetails() {
        return verkaufsArtikelDetailsRepository.findAll();
    }

    @Override
    public void createVerkaufsArtikelDetail(VerkaufsArtikelDetailsEntity verkaufsArtikelDetail) {
        verkaufsArtikelDetailsRepository.save(verkaufsArtikelDetail);
    }

    @Override
    public VerkaufsArtikelDetailsEntity getVerkaufsArtikelDetail(Long id) {
        return verkaufsArtikelDetailsRepository.getOne(id);
    }

    @Override
    public void updateVerkaufsArtikelDetail(VerkaufsArtikelDetailsEntity verkaufsArtikelDetail) {
        verkaufsArtikelDetailsRepository.save(verkaufsArtikelDetail);
    }

    @Override
    public void deleteVerkaufsArtikelDetail(Long id) {
        verkaufsArtikelDetailsRepository.deleteById(id);
    }
}
