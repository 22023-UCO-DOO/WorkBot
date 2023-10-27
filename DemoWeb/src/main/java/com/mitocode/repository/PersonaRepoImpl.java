package com.mitocode.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class PersonaRepoImpl implements IPersonaRepo{

	private static final Logger LOG = LoggerFactory.getLogger(PersonaRepoImpl.class);
	
	@Override
	public void registrar(String nombre) {
		
		LOG.info("Se ha registrado con exito {}", nombre);
	}

}
