package Rest.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @CrossOrigin
    @RequestMapping(value="")
    public String index(){
        return "index";
    }
}
