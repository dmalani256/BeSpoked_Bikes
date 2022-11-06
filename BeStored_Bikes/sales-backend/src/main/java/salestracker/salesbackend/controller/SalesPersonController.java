package salestracker.salesbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import salestracker.salesbackend.exception.ResourceNotFound;
import salestracker.salesbackend.model.Products;
import salestracker.salesbackend.model.SalesPerson;
import salestracker.salesbackend.repository.SalesPersonRepository;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/sales_person")
public class SalesPersonController {
    @Autowired
    private SalesPersonRepository salesPersonRepository;

    @GetMapping
    public List<SalesPerson> getAllSalesPerson(){ return salesPersonRepository.findAll(); }

    @PutMapping("{id}")
    public ResponseEntity<SalesPerson> updateSalesPerson(@PathVariable int id, @RequestBody SalesPerson salesPersonDetail) {
        SalesPerson updateSalesPerson = salesPersonRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFound("Cannot update sales person for ID:" + id));

        updateSalesPerson.setFirst_name(salesPersonDetail.first_name);
        updateSalesPerson.setLast_name(salesPersonDetail.last_name);
        updateSalesPerson.setAddress(salesPersonDetail.address);
        updateSalesPerson.setPhone_number(salesPersonDetail.phone_number);
        updateSalesPerson.setStart_date(salesPersonDetail.start_date);
        updateSalesPerson.setTermination_date(salesPersonDetail.termination_date);
        updateSalesPerson.setManager(salesPersonDetail.manager);

        salesPersonRepository.save(updateSalesPerson);

        return ResponseEntity.ok(updateSalesPerson);
    }
}
