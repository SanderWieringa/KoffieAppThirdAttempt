package Rest.Controllers;

import Rest.Entities.KoffieApparaatItem;
import Rest.Services.KoffieApparaatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/home")
@RestController
public class KoffieApparaatController {

    @Autowired
    private KoffieApparaatService koffieApparaatService;

    @RequestMapping(value = "/hello")
    public String sayHi(){
        return "Hi";
    }

    @RequestMapping(value = "/koffieItems")
    public List<KoffieApparaatItem> getAllItems() {
        return koffieApparaatService.getAllKoffieApparaatItems();
    }

    @RequestMapping(value = "/koffieItems/{id}")
    public KoffieApparaatItem getKoffieApparaatItem(@PathVariable int id) {
        return koffieApparaatService.getKoffieApparaatItem(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/koffieItems")
    public void addKoffieApparaatItem(@RequestBody KoffieApparaatItem koffieApparaatItem) {
        koffieApparaatService.addKoffieApparaatItem(koffieApparaatItem);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/koffieItems/{id}")
    public void updateKoffieApparaatItem(@RequestBody KoffieApparaatItem koffieApparaatItem) {
        koffieApparaatService.updateKoffieApparaatItem(koffieApparaatItem);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/koffieItems/{id}")
    public void deleteKoffieApparaatItem(@PathVariable int id) {
        koffieApparaatService.deleteKoffieApparaatItem(id);
    }


}
