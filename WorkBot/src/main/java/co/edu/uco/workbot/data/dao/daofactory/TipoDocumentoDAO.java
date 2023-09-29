package co.edu.uco.workbot.data.dao.daofactory;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


import co.edu.uco.workbot.data.entity.TipoDocumentoEntity;

public interface TipoDocumentoDAO {

	void crear(TipoDocumentoEntity entity);

	void modificar(TipoDocumentoEntity entity);
	
	void eliminar(UUID id);
	
	Optional<TipoDocumentoEntity> consultarPorId(UUID id);
	
	List<TipoDocumentoEntity> consultar(TipoDocumentoEntity entity);
}
