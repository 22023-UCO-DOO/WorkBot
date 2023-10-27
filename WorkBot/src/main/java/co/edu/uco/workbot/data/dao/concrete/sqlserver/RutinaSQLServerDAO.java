package co.edu.uco.workbot.data.dao.concrete.sqlserver;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.workbot.data.dao.RutinaDAO;
import co.edu.uco.workbot.data.dao.base.SQLDAO;
import co.edu.uco.workbot.data.entity.RutinaEntity;

public class RutinaSQLServerDAO extends SQLDAO implements RutinaDAO{

	public RutinaSQLServerDAO(Connection conexion) {
		super(conexion);
		
	}

	@Override
	public void crear(RutinaEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar(RutinaEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(UUID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<RutinaEntity> consultarPorId(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<RutinaEntity> consultar(RutinaEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
