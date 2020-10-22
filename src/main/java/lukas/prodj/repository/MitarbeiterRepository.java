package lukas.prodj.repository;

import lukas.prodj.entity.MitarbeiterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MitarbeiterRepository extends JpaRepository<MitarbeiterEntity,Long> {
}
