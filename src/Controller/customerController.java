import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/customers")
public class CustomerController {
    private final CustomerRepo customerRepo;

    @GetMapping
    ResponseEntity<List<Customer>> getCustomers(){
        return new ResponseEntity<>((List<Customer>) customerRepo.findAll(), HttpStatus.OK);
    }

    @PostMapping
    ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer){
        return new ResponseEntity<>(customerRepo.save(customer), HttpStatus.OK);
    }


}