package com.example.controller;


import com.example.Service.ProdcutService;
import com.example.entity.product.Product;
import com.example.entity.user.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;


@RestController
public class ProdcutController {


    @Autowired
    private ProdcutService prodcutService;

    @PostMapping("/products")
    public Product addProduct(@Valid @RequestBody Product product) throws Exception {
        Product prodres = prodcutService.addProduct(product);
        return prodres;
    }

    @GetMapping("/products")
    public List<Product> fetchAllProducts() {
        return prodcutService.getAllProducts();
    }


}
