package lukas.prodj.service.serviceImpl;

import lukas.prodj.entity.VerkaufsArtikelEntity;
import lukas.prodj.repository.VerkaufsArtikelRepository;
import lukas.prodj.service.VerkaufsArtikelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VerkaufsArtikelServiceImpl implements VerkaufsArtikelService {

    @Autowired
    private VerkaufsArtikelRepository verkaufsArtikelRepository;

    @Override
    public List<VerkaufsArtikelEntity> getVerkaufsArtikels() {
        return verkaufsArtikelRepository.findAll();
    }

    @Override
    public void createVerkaufsArtikel(VerkaufsArtikelEntity verkaufsArtikel) {
        verkaufsArtikelRepository.save(verkaufsArtikel);
    }

    @Override
    public VerkaufsArtikelEntity getVerkaufsArtikel(Long id) {
        return verkaufsArtikelRepository.getOne(id);
    }

    @Override
    public void updateVerkaufsArtikel(VerkaufsArtikelEntity verkaufsArtikel) {
        verkaufsArtikelRepository.save(verkaufsArtikel);
    }

    @Override
    public void deleteVerkaufsArtikel(Long id) {
        verkaufsArtikelRepository.deleteById(id);
    }
}
