package Rest.Controllers;

import Rest.Entities.KoffieApparaatItem;
import Rest.Services.KoffieApparaatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class KoffieApparaatController {

    @Autowired
    private KoffieApparaatService koffieApparaatService;

    @CrossOrigin
    @RequestMapping(value = "/hello")
    public String sayHi(){
        return "Hi";
    }

    @CrossOrigin
    @RequestMapping(value = "/koffieItems")
    public List<KoffieApparaatItem> getAllItems() {
        return koffieApparaatService.getAllKoffieApparaatItems();
    }

    @CrossOrigin
    @RequestMapping(value = "/koffieItems/{id}")
    public KoffieApparaatItem getKoffieApparaatItem(@PathVariable int id) {
        return koffieApparaatService.getKoffieApparaatItem(id);
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.POST, value = "/koffieItems")
    public void addKoffieApparaatItem(@RequestBody KoffieApparaatItem koffieApparaatItem) {
        koffieApparaatService.addKoffieApparaatItem(koffieApparaatItem);
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.PUT, value = "/koffieItems/{id}")
    public void updateKoffieApparaatItem(@RequestBody KoffieApparaatItem koffieApparaatItem) {
        koffieApparaatService.updateKoffieApparaatItem(koffieApparaatItem);
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.DELETE, value = "/koffieItems/{id}")
    public void deleteKoffieApparaatItem(@PathVariable int id) {
        koffieApparaatService.deleteKoffieApparaatItem(id);
    }


}
