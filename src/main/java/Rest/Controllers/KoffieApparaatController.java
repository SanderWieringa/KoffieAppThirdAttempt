package Rest.Controllers;

import Rest.Entities.KoffieApparaatItem;
import Rest.Services.KoffieApparaatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;

@RestController
public class KoffieApparaatController {

    @Autowired
    private KoffieApparaatService koffieApparaatService;

    @CrossOrigin
    @RequestMapping(value = "/hello")
    public ResponseEntity<String> sayHi(){
        try {
            return new ResponseEntity<String>("Hi", HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.I_AM_A_TEAPOT);
        }
    }

    @CrossOrigin
    @RequestMapping(value = "/koffieItems")
    public ResponseEntity<List<KoffieApparaatItem>> getAllItems() {
        try {
            return new ResponseEntity<>(koffieApparaatService.getAllKoffieApparaatItems(), HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @CrossOrigin
    @RequestMapping(value = "/koffieItems/{id}")
    public ResponseEntity<KoffieApparaatItem> getKoffieApparaatItem(@PathVariable int id) {
        try {
            return new ResponseEntity<>(koffieApparaatService.getKoffieApparaatItem(id), HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.POST, value = "/koffieItems")
    public ResponseEntity addKoffieApparaatItem(@RequestBody KoffieApparaatItem koffieApparaatItem) {
        try {
            koffieApparaatService.addKoffieApparaatItem(koffieApparaatItem);
            return new ResponseEntity(HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }

    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.PUT, value = "/koffieItems/{id}")
    public ResponseEntity updateKoffieApparaatItem(@RequestBody KoffieApparaatItem koffieApparaatItem) {
        try {
            koffieApparaatService.updateKoffieApparaatItem(koffieApparaatItem);
            return new ResponseEntity(HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.DELETE, value = "/koffieItems/{id}")
    public ResponseEntity deleteKoffieApparaatItem(@PathVariable int id) {
        try {
            koffieApparaatService.deleteKoffieApparaatItem(id);
            return new ResponseEntity(HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }


}
