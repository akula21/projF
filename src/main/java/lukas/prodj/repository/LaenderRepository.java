package lukas.prodj.repository;

import lukas.prodj.entity.LaenderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaenderRepository extends JpaRepository<LaenderEntity, Long> {
}
