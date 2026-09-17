package com.example.productsrestapiwithjpa.Repository;

import com.example.productsrestapiwithjpa.Model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products,Integer>{
}
