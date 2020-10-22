package lukas.prodj.repository;

import lukas.prodj.entity.KaefigDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KaefigDetailsRepository extends JpaRepository<KaefigDetailsEntity, Long> {
}
