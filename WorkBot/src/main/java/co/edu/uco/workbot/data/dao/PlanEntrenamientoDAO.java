package co.edu.uco.workbot.data.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.workbot.data.entity.PlanEntrenamientoEntity;



public interface PlanEntrenamientoDAO {

	void crear(PlanEntrenamientoEntity entity);

	void modificar(PlanEntrenamientoEntity entity);
	

	
	Optional<PlanEntrenamientoEntity> consultarPorId(UUID id);
	
	List<PlanEntrenamientoEntity> consultar(PlanEntrenamientoEntity entity);
}
