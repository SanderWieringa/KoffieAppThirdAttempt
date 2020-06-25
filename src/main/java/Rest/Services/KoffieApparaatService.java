package Rest.Services;

import Rest.Entities.KoffieApparaatItem;
import Rest.Repositories.KoffieApparaatItemJpaRepository;
import Rest.Repositories.KoffieApparaatItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class KoffieApparaatService {

    @Autowired
    private KoffieApparaatItemRepository koffieApparaatItemRepository;

    @Autowired
    private KoffieApparaatItemJpaRepository koffieApparaatItemJpaRepository;

    public KoffieApparaatItem getKoffieApparaatItemByName(String name) {
        return koffieApparaatItemJpaRepository.findByName(name);
    }

    public List<KoffieApparaatItem> getAllKoffieApparaatItems() {
        List<KoffieApparaatItem> koffieApparaatItems = new ArrayList<>();
        koffieApparaatItemRepository.findAll()
                .forEach(koffieApparaatItems::add);
        return koffieApparaatItems;
    }

    public void addKoffieApparaatItem(KoffieApparaatItem koffieApparaatItem) {
        koffieApparaatItemRepository.save(koffieApparaatItem);
    }

    public KoffieApparaatItem getKoffieApparaatItem(int id) {
        return koffieApparaatItemRepository.findById(id).get();
    }

    public void updateKoffieApparaatItem(KoffieApparaatItem koffieApparaatItem) {
        koffieApparaatItemRepository.save(koffieApparaatItem);
    }

    public void deleteKoffieApparaatItem(int id) {
        koffieApparaatItemRepository.deleteById(id);
    }
}
