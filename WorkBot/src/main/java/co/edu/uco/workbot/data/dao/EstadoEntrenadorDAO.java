package co.edu.uco.workbot.data.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.workbot.data.entity.EstadoEntrenadorEntity;


public interface EstadoEntrenadorDAO {


	
	Optional<EstadoEntrenadorEntity> consultarPorId(UUID id);
	
	List<EstadoEntrenadorEntity> consultar(EstadoEntrenadorEntity entity);
}
