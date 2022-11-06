package salestracker.salesbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import salestracker.salesbackend.exception.ResourceNotFound;
import salestracker.salesbackend.model.Products;
import salestracker.salesbackend.repository.ProductRepository;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public List<Products> getAllProducts(){
        return productRepository.findAll();
    }

    @PutMapping("{id}")
    public ResponseEntity<Products> updateProducts(@PathVariable  int id, @RequestBody Products productDetail){
        Products updateProduct = productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFound("Cannot update product values for ID:" + id));

        updateProduct.setQuantity(productDetail.quantity);
        updateProduct.setCommissionPercent(productDetail.commissionPercent);
        updateProduct.setSalePrice(productDetail.salePrice);
        updateProduct.setPurchasePrice(productDetail.purchasePrice);
        updateProduct.setStyle(productDetail.style);
        updateProduct.setName(productDetail.name);
        updateProduct.setManufacturer(productDetail.manufacturer);

        productRepository.save(updateProduct);

        return ResponseEntity.ok(updateProduct);
    }

}
