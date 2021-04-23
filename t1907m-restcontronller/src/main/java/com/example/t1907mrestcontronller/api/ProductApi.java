package com.example.t1907mrestcontronller.api;

import com.example.t1907mrestcontronller.jpa.Product;
import com.example.t1907mrestcontronller.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/products")
@RequiredArgsConstructor
public class ProductApi {
    private final ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> finall(){
        return ResponseEntity.ok(productService.fillAllProduct());
    }
    @PostMapping
    public ResponseEntity  createProduct(@Valid @RequestBody Product product){
        return ResponseEntity.ok(productService.saveProduct(product));

    }
    @GetMapping("/id")
    public ResponseEntity<Product> findById(@PathVariable Integer id){

        Optional<Product> product = productService.finById(id);
        if (!product.isPresent()){
            ResponseEntity.badRequest().build();
        }
        // neu co thi
        return ResponseEntity.ok(product.get());


    }
    @DeleteMapping
    public ResponseEntity delete(@PathVariable Integer id){

        Optional<com.example.t1907mrestcontronller.jpa.Product> product = productService.finById(id);
        if (!product.isPresent()){
            ResponseEntity.badRequest().build();
        }
        // neu co thi
        productService.deleteProductById(id);
        return ResponseEntity.ok().build();


    }
    @PutMapping("/id")
    public ResponseEntity<Product>
    findById(@PathVariable Integer id,@Valid @RequestBody Product pro){

        Optional<Product> product = productService.finById(id);
        if (!product.isPresent()){
            ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(productService.saveProduct(pro));

    }

}
