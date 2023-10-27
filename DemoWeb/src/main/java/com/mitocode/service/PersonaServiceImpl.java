package com.mitocode.service;

import com.mitocode.repository.IPersonaRepo;

public class PersonaServiceImpl implements IPersonaService{

	private IPersonaRepo repo;
	
	@Override
	public void registrar(String nombre) {
		repo.registrar(nombre);
		
	}

}
