package com.example.repository.product;

import com.example.entity.product.Product;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.QueryHint;
import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long> {
    @QueryHints(@QueryHint(name= org.hibernate.annotations.QueryHints.CACHEABLE, value="true"))
    public List<Product> findAll();
}
