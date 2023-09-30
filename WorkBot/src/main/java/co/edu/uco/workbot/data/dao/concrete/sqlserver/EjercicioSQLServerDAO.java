package co.edu.uco.workbot.data.dao.concrete.sqlserver;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.workbot.data.dao.EjercicioDAO;
import co.edu.uco.workbot.data.dao.base.SQLDAO;
import co.edu.uco.workbot.data.entity.EjercicioEntity;

public class EjercicioSQLServerDAO extends SQLDAO implements EjercicioDAO{

	public EjercicioSQLServerDAO(Connection conexion) {
		super(conexion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void crear(EjercicioEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar(EjercicioEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(UUID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<EjercicioEntity> consultarPorId(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<EjercicioEntity> consultar(EjercicioEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
