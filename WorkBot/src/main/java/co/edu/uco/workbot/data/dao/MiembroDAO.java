package co.edu.uco.workbot.data.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.workbot.data.entity.MiembroEntity;


public interface MiembroDAO {

	void crear(MiembroEntity entity);

	void modificar(MiembroEntity entity);
	
	
	
	Optional<MiembroEntity> consultarPorId(UUID id);
	
	List<MiembroEntity> consultar(MiembroEntity entity);
}
