package Rest.Repositories;

import Rest.Entities.KoffieApparaatItem;
import org.springframework.data.repository.CrudRepository;

@org.springframework.stereotype.Repository
public interface KoffieApparaatItemRepository extends CrudRepository<KoffieApparaatItem, Integer> {

}
