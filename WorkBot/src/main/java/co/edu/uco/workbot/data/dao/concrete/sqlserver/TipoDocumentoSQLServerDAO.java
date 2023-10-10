package co.edu.uco.workbot.data.dao.concrete.sqlserver;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.workbot.data.dao.TipoDocumentoDAO;
import co.edu.uco.workbot.data.dao.base.SQLDAO;
import co.edu.uco.workbot.data.entity.TipoDocumentoEntity;

public class TipoDocumentoSQLServerDAO extends SQLDAO implements TipoDocumentoDAO{

	public TipoDocumentoSQLServerDAO(Connection conexion) {
		super(conexion);
		
	}

	@Override
	public Optional<TipoDocumentoEntity> consultarPorId(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<TipoDocumentoEntity> consultar(TipoDocumentoEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
