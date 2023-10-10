package co.edu.uco.workbot.data.dao.concrete.sqlserver;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.workbot.data.dao.PlanEntrenamientoDAO;
import co.edu.uco.workbot.data.dao.base.SQLDAO;
import co.edu.uco.workbot.data.entity.PlanEntrenamientoEntity;

public class PlanEntrenamientoSQLServerDAO extends SQLDAO implements PlanEntrenamientoDAO{

	public PlanEntrenamientoSQLServerDAO(Connection conexion) {
		super(conexion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void crear(PlanEntrenamientoEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar(PlanEntrenamientoEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<PlanEntrenamientoEntity> consultarPorId(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<PlanEntrenamientoEntity> consultar(PlanEntrenamientoEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
