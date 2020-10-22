package lukas.prodj.repository;

import lukas.prodj.entity.ProduktGruppe3Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduktGruppe3Repository extends JpaRepository<ProduktGruppe3Entity, Long> {
}
