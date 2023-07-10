package com.geekster.EcommerceAPI.service;

import com.geekster.EcommerceAPI.model.Product;
import com.geekster.EcommerceAPI.repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    IProductRepo productRepo;

    public String createProduct(Product product) {
        productRepo.save(product);
        return "Product has been added!!";
    }

    public List<Product> getAllProductsByProCategory(String productCategory) {
        return productRepo.findAllByProductCategory();
    }

    public String deleteProductById(Long productId) {
        Product product = productRepo.findById(productId).get();

        if(product != null){
            productRepo.deleteById(productId);
            return "Given Product has been deleted!!";
        }
        else{
            return "Product of this id "+productId+ " doesn't exist!!";
        }
    }
}
