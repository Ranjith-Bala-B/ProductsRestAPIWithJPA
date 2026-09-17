package com.example.productsrestapiwithjpa.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productsId;
    private String productsName;
    private Double price;
    private Integer quantity;
    private String category;
    private Boolean inStock;

    public Products() {

    }

    public Products(Integer productsId, String productsName, Double price,Integer quantity, String category, Boolean inStock) {

        this.productsId = productsId;
        this.productsName = productsName;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.inStock = inStock;
    }

    public Integer getProductsId() {
        return productsId;
    }

    public void setProductsId(Integer productsId) {
        this.productsId = productsId;
    }

    public String getProductsName() {
        return productsName;
    }

    public void setProductsName(String productsName) {
        this.productsName = productsName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getInStock() {
        return inStock;
    }

    public void setInStock(Boolean inStock) {
        this.inStock = inStock;
    }
}