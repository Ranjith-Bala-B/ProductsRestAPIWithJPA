package com.example.productsrestapiwithjpa.Service;

import com.example.productsrestapiwithjpa.Model.Products;
import com.example.productsrestapiwithjpa.Repository.ProductsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {

    private final ProductsRepository productsRepository;

    public ProductsService(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    public Products addProducts(Products products) {
        return productsRepository.save(products);
    }

    public List<Products> getAllProducts() {
        return productsRepository.findAll();
    }

    public Products getProductsById(int id) {
        return productsRepository.findById(id).orElse(null);
    }

    public Products updateProducts(Integer id, Products updatedProducts) {

        Products existingProducts = productsRepository.findById(id).orElse(null);

        if (existingProducts == null) {
            return null;
        }

        existingProducts.setProductsName(updatedProducts.getProductsName());
        existingProducts.setPrice(updatedProducts.getPrice());
        existingProducts.setQuantity(updatedProducts.getQuantity());
        existingProducts.setCategory(updatedProducts.getCategory());
        existingProducts.setInStock(updatedProducts.getInStock());

        return productsRepository.save(existingProducts);
    }

    public boolean deleteProducts(int id) {

        if (!productsRepository.existsById(id)) {
            return false;
        }

        productsRepository.deleteById(id);
        return true;
    }
}