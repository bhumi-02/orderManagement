
import java.util.List;


@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderRepo orderRepo;

    @GetMapping
    ResponseEntity<List<Orders>> getOrders(){
        return new ResponseEntity<>(orderRepo.findAll(), HttpStatus.OK);
    }

    @PostMapping
    ResponseEntity<Orders> saveOrder(@RequestBody Orders orders){
        return new ResponseEntity<>(orderRepo.save(orders), HttpStatus.OK);
    }
}