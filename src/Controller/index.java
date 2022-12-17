import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class Index {

    @GetMapping()
    Map index(){
        Map map = new HashMap();
        map.put("title", "Home Page Orders Management System.");
        map.put("waktu", new Date());
        return  map;
    }
}