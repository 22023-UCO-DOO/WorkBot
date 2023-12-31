package co.edu.uco.workbot.data.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


import co.edu.uco.workbot.data.entity.TipoDocumentoEntity;

public interface TipoDocumentoDAO {


	
	Optional<TipoDocumentoEntity> consultarPorId(UUID id);
	
	List<TipoDocumentoEntity> consultar(TipoDocumentoEntity entity);
}
