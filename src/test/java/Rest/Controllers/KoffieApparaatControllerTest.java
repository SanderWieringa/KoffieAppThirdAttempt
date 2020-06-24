package Rest.Controllers;

import Rest.Entities.KoffieApparaatItem;
import Rest.Entities.Sugar;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KoffieApparaatControllerTest {

    @Test
    void testGetAllKoffieItems() {
        KoffieApparaatController controller = new KoffieApparaatController();

        List<KoffieApparaatItem> koffieItems = (List<KoffieApparaatItem>) controller.getAllItems();

        assertEquals(koffieItems.get(0).getName(), "Cappuccino");
    }
}