package com.usp.masterframework.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usp.masterframework.documents.Agent;
import com.usp.masterframework.documents.Institution;
import com.usp.masterframework.repositories.InstitutionRepository;
import com.usp.masterframework.services.InstitutionService;

@Service
public class InstitutionServiceImpl implements InstitutionService{
	
	@Autowired
	private InstitutionRepository institutionRepository;
	
	
	@Override
	public List<Institution> listAll() {
		return this.institutionRepository.findAll();
	}

	@Override
	public Optional <Institution> listById(Integer id) {
		return this.institutionRepository.findById(id);
	}

	@Override
	public Institution register(Institution institution) {
		return this.institutionRepository.save(institution);
	}

	@Override
	public Institution update(Institution institution) {
		return this.institutionRepository.save(institution);
	}

	@Override
	public void remove(Integer id) {
		this.institutionRepository.deleteById(id);
	}

    @Override
	public  Set<Agent> listAllInstitutionAgents(Integer id) {
    		return this.institutionRepository.findById(id).get().getAgents();
	}
    
}
