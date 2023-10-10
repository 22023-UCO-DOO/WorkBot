package co.edu.uco.workbot.data.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.workbot.data.entity.DuracionEntity;


public interface DuracionDAO {

	void crear(DuracionEntity entity);

	
	
	Optional<DuracionEntity> consultarPorId(UUID id);
	
	List<DuracionEntity> consultar(DuracionEntity entity);
}
