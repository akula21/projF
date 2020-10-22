package lukas.prodj.repository;


import lukas.prodj.entity.KundenStammEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KundenStammRepository extends JpaRepository<KundenStammEntity, Long> {
}
