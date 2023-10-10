package co.edu.uco.workbot.data.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.workbot.data.entity.RutinaEntity;


public interface RutinaDAO {

	void crear(RutinaEntity entity);

	void modificar(RutinaEntity entity);
	
	void eliminar(UUID id);
	
	Optional<RutinaEntity> consultarPorId(UUID id);
	
	List<RutinaEntity> consultar(RutinaEntity entity);
}
