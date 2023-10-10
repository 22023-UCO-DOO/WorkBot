package co.edu.uco.workbot.data.dao.concrete.sqlserver;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.workbot.data.dao.CalendarioDAO;
import co.edu.uco.workbot.data.dao.base.SQLDAO;
import co.edu.uco.workbot.data.entity.CalendarioEntity;

public class CalendarioSQLServerDAO extends SQLDAO implements CalendarioDAO{

	public CalendarioSQLServerDAO(Connection conexion) {
		super(conexion);
		
	}

	@Override
	public Optional<CalendarioEntity> consultarPorId(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<CalendarioEntity> consultar(CalendarioEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
