package org.example.backend.control;

import org.example.backend.model.Customer;
import org.example.backend.serv.MainService;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/customers")
public class MainController {

    private final MainService mainService;

    public MainController(MainService mainService) {
        this.mainService = mainService;
    }

    @GetMapping("/setup")
    public Iterable<Customer> setupUsers() {
        return mainService.setupUsers();
    }

    @GetMapping
    public Iterable<Customer> getAllUsers() {
        return mainService.getAllCustomers();
    }

    @GetMapping("/firstname/{firstname}")
    public Customer findByFirstname(@PathVariable String firstname) {
        return mainService.findByFirstname(firstname);
    }

    @GetMapping("/lastname/{lastname}")
    public Iterable<Customer> findByLastname(@PathVariable String lastname) {
        return mainService.findByLastname(lastname);
    }

    @PutMapping("/update/{firstname}/{newFirstname}")
    public String updateByFirstname(@PathVariable String firstname, @PathVariable String newFirstname) {
        return mainService.updateFirstname(firstname, newFirstname);
    }

    @PutMapping("/{firstname}/addarticle/{type}/{prize}")
    public String addArticle(@PathVariable String firstname, @PathVariable String type, @PathVariable double prize) {
        return mainService.addArticle(firstname, type, prize);
    }

    @DeleteMapping("/delete/{lastname}")
    public String deleteCustomerByLastname(@PathVariable String lastname) {
        return mainService.deleteByLastname(lastname);
    }
}