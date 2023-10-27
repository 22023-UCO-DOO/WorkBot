package co.edu.uco.workbot.data.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.workbot.data.entity.RepeticionEntity;



public interface RepeticionDAO {


	void crear(RepeticionEntity entity);
	Optional<RepeticionEntity> consultarPorId(UUID id);
	
	List<RepeticionEntity> consultar(RepeticionEntity entity);
}
