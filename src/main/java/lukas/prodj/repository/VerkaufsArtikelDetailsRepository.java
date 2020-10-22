package lukas.prodj.repository;

import lukas.prodj.entity.VerkaufsArtikelDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VerkaufsArtikelDetailsRepository extends JpaRepository<VerkaufsArtikelDetailsEntity, Long> {
}
