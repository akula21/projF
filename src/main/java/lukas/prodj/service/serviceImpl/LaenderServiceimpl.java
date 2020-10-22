package lukas.prodj.service.serviceImpl;

import lukas.prodj.entity.LaenderEntity;
import lukas.prodj.repository.LaenderRepository;
import lukas.prodj.service.LaenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaenderServiceimpl implements LaenderService {

    @Autowired
    private LaenderRepository laenderRepository;

    @Override
    public List<LaenderEntity> getLaenders() {
        return laenderRepository.findAll();
    }

    @Override
    public void createLaender(LaenderEntity laender) {
        laenderRepository.save(laender);
    }

    @Override
    public LaenderEntity getLaender(Long id) {
        return laenderRepository.getOne(id);
    }

    @Override
    public void updateLaender(LaenderEntity laender) {
        laenderRepository.save(laender);
    }

    @Override
    public void deleteLaender(Long id) {
        laenderRepository.deleteById(id);
    }
}
