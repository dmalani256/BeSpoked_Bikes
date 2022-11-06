package salestracker.salesbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import salestracker.salesbackend.exception.ResourceNotFound;
import salestracker.salesbackend.model.Customer;
import salestracker.salesbackend.model.Sales;
import salestracker.salesbackend.repository.SalesRepository;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/sales")
public class SalesController {
    @Autowired
    private SalesRepository salesRepository;

    @GetMapping
    public List<Sales> getAllSales(){
        return salesRepository.findAll();
    }

    @PostMapping("create_sales")
    public Sales createSales(@RequestBody Sales sales){
        return salesRepository.save(sales);
    }
}
