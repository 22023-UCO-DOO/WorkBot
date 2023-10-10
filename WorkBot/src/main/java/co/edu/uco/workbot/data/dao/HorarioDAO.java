package co.edu.uco.workbot.data.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


import co.edu.uco.workbot.data.entity.HorarioEntity;

public interface HorarioDAO {

	void crear(HorarioEntity entity);

	void modificar(HorarioEntity entity);
	
	void eliminar(UUID id);
	
	Optional<HorarioEntity> consultarPorId(UUID id);
	
	List<HorarioEntity> consultar(HorarioEntity entity);
}
