package com.geekster.EcommerceAPI.controller;

import com.geekster.EcommerceAPI.model.Product;
import com.geekster.EcommerceAPI.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    //creating product
    @PostMapping("products")
    public String createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }

    //get all product by product category
    @GetMapping("products")
    public List<Product> getAllProductsByProCategory(@RequestParam String productCategory){
        return productService.getAllProductsByProCategory(productCategory);
    }

    //Delete product by product Id
    @DeleteMapping("products/{productId}")
    public String deleteProductById(@PathVariable Long productId){
        return productService.deleteProductById(productId);
    }
}
