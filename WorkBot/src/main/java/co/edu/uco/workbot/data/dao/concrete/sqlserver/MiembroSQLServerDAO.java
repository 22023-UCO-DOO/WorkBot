package co.edu.uco.workbot.data.dao.concrete.sqlserver;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.workbot.data.dao.MiembroDAO;
import co.edu.uco.workbot.data.dao.base.SQLDAO;
import co.edu.uco.workbot.data.entity.MiembroEntity;

public class MiembroSQLServerDAO extends SQLDAO implements MiembroDAO{

	public MiembroSQLServerDAO(Connection conexion) {
		super(conexion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void crear(MiembroEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar(MiembroEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<MiembroEntity> consultarPorId(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<MiembroEntity> consultar(MiembroEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
