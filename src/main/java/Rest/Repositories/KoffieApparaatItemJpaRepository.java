package Rest.Repositories;

import Rest.Entities.KoffieApparaatItem;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface KoffieApparaatItemJpaRepository extends JpaRepository<KoffieApparaatItem, Integer> {
    KoffieApparaatItem findByName(String name);
}
