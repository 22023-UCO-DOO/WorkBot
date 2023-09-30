package co.edu.uco.workbot.data.dao.concrete.sqlserver;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.workbot.data.dao.RepeticionDAO;
import co.edu.uco.workbot.data.dao.base.SQLDAO;
import co.edu.uco.workbot.data.entity.RepeticionEntity;

public class RepeticionSQLServerDAO extends SQLDAO implements RepeticionDAO{

	public RepeticionSQLServerDAO(Connection conexion) {
		super(conexion);
		
	}

	@Override
	public Optional<RepeticionEntity> consultarPorId(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<RepeticionEntity> consultar(RepeticionEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
