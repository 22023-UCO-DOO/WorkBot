package co.edu.uco.workbot.data.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.workbot.data.entity.EntrenadorEntity;


public interface EntrenadorDAO {

	void crear(EntrenadorEntity entity);

	void modificar(EntrenadorEntity entity);
	

	
	Optional<EntrenadorEntity> consultarPorId(UUID id);
	
	List<EntrenadorEntity> consultar(EntrenadorEntity entity);
}
