package co.edu.uco.workbot.data.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.workbot.data.entity.CalendarioEntity;


public interface CalendarioDAO {

	
	
	Optional<CalendarioEntity> consultarPorId(UUID id);
	
	List<CalendarioEntity> consultar(CalendarioEntity entity);
}
