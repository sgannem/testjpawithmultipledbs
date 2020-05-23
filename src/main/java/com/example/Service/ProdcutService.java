package com.example.Service;

import com.example.entity.product.Product;
import com.example.entity.user.Users;
import com.example.repository.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProdcutService {

    @Autowired
    ProductRepository productRepository;

    // @Transactional
    public Product addProduct(Product product) {
        Product product1 = productRepository.save(product);
        return product1;
    }

    public List<Product> getAllProducts(){
        return (List<Product>) productRepository.findAll();

    }

}
