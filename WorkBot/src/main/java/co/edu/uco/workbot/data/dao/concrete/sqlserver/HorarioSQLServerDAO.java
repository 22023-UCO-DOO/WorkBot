package co.edu.uco.workbot.data.dao.concrete.sqlserver;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.workbot.data.dao.HorarioDAO;
import co.edu.uco.workbot.data.dao.base.SQLDAO;
import co.edu.uco.workbot.data.entity.HorarioEntity;

public class HorarioSQLServerDAO extends SQLDAO implements HorarioDAO{

	protected HorarioSQLServerDAO(Connection conexion) {
		super(conexion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void crear(HorarioEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar(HorarioEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(UUID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<HorarioEntity> consultarPorId(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<HorarioEntity> consultar(HorarioEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
