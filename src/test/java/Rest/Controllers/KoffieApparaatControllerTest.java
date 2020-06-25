package Rest.Controllers;

import Rest.Entities.KoffieApparaatItem;
import Rest.Entities.Milk;
import Rest.Entities.Sugar;
import Rest.Repositories.KoffieApparaatItemJpaRepository;
import Rest.Services.KoffieApparaatService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@DataJpaTest
@ActiveProfiles("junit")
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
public class KoffieApparaatControllerTest {

    public List<Milk> milkList = new ArrayList<>();

    private List<Sugar> sugarList = new ArrayList<>();

    @Autowired
    private TestEntityManager entityManager;
    @Autowired
    private KoffieApparaatItemJpaRepository koffieRepository;

    @Test
    void getKoffieItemByName() throws Exception {
        KoffieApparaatItem expected = new KoffieApparaatItem();
        expected.setName("Cappuccino");
        expected.setCost(1.1);
        expected.setSugar(sugarList);
        expected.setMilk(milkList);

        entityManager.persist(expected);
        entityManager.flush();

        KoffieApparaatItem actual = koffieRepository.findByName(expected.getName());

        assertNotNull(entityManager);
        assertEquals(expected.getName(), actual.getName());
    }
}