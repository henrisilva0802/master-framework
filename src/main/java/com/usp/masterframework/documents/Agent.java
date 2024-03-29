package com.usp.masterframework.documents;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.Id;

@Entity
@Table(name = "agent")
public class Agent extends Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "institution_id")
	@NotNull
	@JsonBackReference
	private Institution institution;
	
	public Agent() {
		super();
	}
	
	
	public Agent(Integer id, @NotNull Institution institution) {
		super();
		this.id = id;
		this.institution = institution;
	}


	public Institution getInstitution() {
		return institution;
	}


	public void setInstitution(Institution institution) {
		this.institution = institution;
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String getName() {

		return super.getName();
	}

	@Override
	public void setName(String name) {
		super.setName(name);
	}

	@Override
	public String getEmail() {
		return super.getEmail();
	}

	@Override
	public void setEmail(String email) {
		super.setEmail(email);
	}

}
