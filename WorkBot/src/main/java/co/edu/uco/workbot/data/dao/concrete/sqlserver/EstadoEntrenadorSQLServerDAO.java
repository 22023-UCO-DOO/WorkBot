package co.edu.uco.workbot.data.dao.concrete.sqlserver;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.workbot.data.dao.EstadoEntrenadorDAO;
import co.edu.uco.workbot.data.dao.base.SQLDAO;
import co.edu.uco.workbot.data.entity.EstadoEntrenadorEntity;

public class EstadoEntrenadorSQLServerDAO extends SQLDAO implements EstadoEntrenadorDAO{

	public EstadoEntrenadorSQLServerDAO(Connection conexion) {
		super(conexion);
		
	}

	@Override
	public Optional<EstadoEntrenadorEntity> consultarPorId(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<EstadoEntrenadorEntity> consultar(EstadoEntrenadorEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
