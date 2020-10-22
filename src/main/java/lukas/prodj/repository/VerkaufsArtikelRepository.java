package lukas.prodj.repository;

import lukas.prodj.entity.VerkaufsArtikelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VerkaufsArtikelRepository extends JpaRepository<VerkaufsArtikelEntity, Long> {
}
