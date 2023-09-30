package co.edu.uco.workbot.data.dao.concrete.sqlserver;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.workbot.data.dao.DuracionDAO;
import co.edu.uco.workbot.data.dao.base.SQLDAO;
import co.edu.uco.workbot.data.entity.DuracionEntity;

public class DuracionSQLServerDAO extends SQLDAO implements DuracionDAO{

	public DuracionSQLServerDAO(Connection conexion) {
		super(conexion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void crear(DuracionEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<DuracionEntity> consultarPorId(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<DuracionEntity> consultar(DuracionEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
