package lukas.prodj.repository;

import lukas.prodj.entity.ProduktGruppe4Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduktGruppe4Repository extends JpaRepository<ProduktGruppe4Entity, Long> {
}
