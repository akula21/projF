package lukas.prodj.repository;

import lukas.prodj.entity.KopfteilDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KopfteilDetailsRepository extends JpaRepository<KopfteilDetailsEntity, Long> {
}
