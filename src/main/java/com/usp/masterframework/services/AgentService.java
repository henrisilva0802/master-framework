package com.usp.masterframework.services;

import java.util.List;
import java.util.Optional;

import com.usp.masterframework.documents.Agent;

public interface AgentService {
	
 List<Agent> listAll();
 
 Optional <Agent> listById(Integer id);
 
 Agent register (Agent agent);
 
 Agent update(Agent agent);
 
 void remove(Integer Id);
 
}
