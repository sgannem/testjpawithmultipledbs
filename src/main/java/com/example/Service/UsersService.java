package com.example.Service;

import com.example.entity.product.Product;
import com.example.entity.user.Department;
import com.example.entity.user.Users;
import com.example.repository.product.ProductRepository;
import com.example.repository.user.DepartmentRepository;
import com.example.repository.user.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsersService {

    @Autowired
    UsersRepository usersRepository;

    @Autowired
    DepartmentRepository deptRepository;

    @Autowired
    ProductRepository productRepository;

   @Transactional
    public Users registerUser(Users users){

        Users users1  = usersRepository.save(users);

        Department dept = new Department();
        dept.setLocation("banl");
        dept.setName("testname-"+users1.getFirstName());
        deptRepository.save(dept);

        Product p1 = new Product();
        p1.setName("Samsungs9new"+users1.getFirstName());
        p1.setPrice(500);

        productRepository.save(p1);

        return users1;
    }

    @Transactional
    public List<Users> getAllUsers(){
      //  System.out.println("********************"+deptRepository.findAll());
       return (List<Users>) usersRepository.findAll();

    }

}
