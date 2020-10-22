package lukas.prodj.repository;

import lukas.prodj.entity.KaefigEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KaefigRepository extends JpaRepository<KaefigEntity, Long> {
}
