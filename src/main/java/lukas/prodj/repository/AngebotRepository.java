package lukas.prodj.repository;

import lukas.prodj.entity.AngebotEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AngebotRepository extends JpaRepository<AngebotEntity, Long> {
}
