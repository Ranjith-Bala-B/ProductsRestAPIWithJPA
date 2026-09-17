package com.example.productsrestapiwithjpa.Controller;

import com.example.productsrestapiwithjpa.Model.Products;
import com.example.productsrestapiwithjpa.Service.ProductsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsController {

    private final ProductsService productsService;

    public ProductsController(ProductsService productsService) {
        this.productsService = productsService;
    }

    @GetMapping
    public List<Products> getAllProducts() {
        return productsService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Products getProductsById(@PathVariable int id) {
        return productsService.getProductsById(id);
    }

    @PostMapping
    public Products addNewProducts(@RequestBody Products newProducts) {
        return productsService.addProducts(newProducts);
    }

    @PutMapping("/{id}")
    public Products updateProducts(@PathVariable int id,@RequestBody Products updatedProducts) {
        return productsService.updateProducts(id, updatedProducts);
    }

    @DeleteMapping("/{id}")
    public String deleteProducts(@PathVariable int id) {
        boolean result = productsService.deleteProducts(id);

        if (result) {
            return "Products deleted successfully";
        } else {
            return "Products Not Found";
        }
    }
}
