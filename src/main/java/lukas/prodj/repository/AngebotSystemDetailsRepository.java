package lukas.prodj.repository;

import lukas.prodj.entity.AngebotSystemDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AngebotSystemDetailsRepository extends JpaRepository<AngebotSystemDetailsEntity, Long> {
}
