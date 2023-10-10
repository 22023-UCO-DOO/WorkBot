package co.edu.uco.workbot.data.dao.concrete.sqlserver;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.workbot.data.dao.EntrenadorDAO;
import co.edu.uco.workbot.data.dao.base.SQLDAO;
import co.edu.uco.workbot.data.entity.EntrenadorEntity;

public class EntrenadorSQLServerDAO extends SQLDAO implements EntrenadorDAO{

	public EntrenadorSQLServerDAO(Connection conexion) {
		super(conexion);

	}

	@Override
	public void crear(EntrenadorEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar(EntrenadorEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<EntrenadorEntity> consultarPorId(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<EntrenadorEntity> consultar(EntrenadorEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
