package com.example.repository.user;

import com.example.entity.user.Department;
import com.example.entity.user.Users;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.QueryHint;
import java.util.List;


public interface DepartmentRepository extends CrudRepository<Department, Long> {

    @QueryHints(@QueryHint(name= org.hibernate.annotations.QueryHints.CACHEABLE, value="true"))
    public List<Department> findAll();
}
