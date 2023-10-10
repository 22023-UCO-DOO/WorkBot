package co.edu.uco.workbot.data.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.workbot.data.entity.SerieEntity;


public interface SerieDAO {

	void crear(SerieEntity entity);


	
	Optional<SerieEntity> consultarPorId(UUID id);
	
	List<SerieEntity> consultar(SerieEntity entity);
}
