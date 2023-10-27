package co.edu.uco.workbot.data.dao.concrete.sqlserver;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.workbot.data.dao.SerieDAO;
import co.edu.uco.workbot.data.dao.base.SQLDAO;
import co.edu.uco.workbot.data.entity.SerieEntity;

public class SerieSQLServerDAO extends SQLDAO implements SerieDAO{

	public SerieSQLServerDAO(Connection conexion) {
		super(conexion);
	
	}

	@Override
	public void crear(SerieEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<SerieEntity> consultarPorId(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<SerieEntity> consultar(SerieEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
