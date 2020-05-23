package com.example.entity.product;

import com.example.entity.user.Users;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name= "product")
public class Product implements Serializable {

	@Id
	@SequenceGenerator(name = "testseq2", sequenceName = "testseq2", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "testseq2")
	private Long id;
	
	private String name;
	
	private double price;

	/*public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}*/

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Product() {
		//
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Product)) return false;
		Product product = (Product) o;
		return Objects.equals(getId(), product.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}
	
	

}
