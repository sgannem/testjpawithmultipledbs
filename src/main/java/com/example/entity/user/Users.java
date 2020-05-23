package com.example.entity.user;

import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name= "users")
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Users implements Serializable {

	@Id
	@SequenceGenerator(name = "testseq1", sequenceName = "testseq1", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "testseq1")
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	
	private String firstName;
	
	private String lastName;
	

	/*public Users(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}*/

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	private Users() {
		//
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Users)) return false;
		Users users = (Users) o;
		return Objects.equals(getId(), users.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

}
