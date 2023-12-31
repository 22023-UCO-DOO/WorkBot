package co.edu.uco.transformate.crosscutting.utils;

import java.sql.Connection;
import java.sql.SQLException;



import co.edu.uco.transformate.crosscutting.exception.TransformateCrossCuttingException;
import co.edu.uco.transformate.crosscutting.utils.Messages.UtilSqlMessage;

public class UtilSql {
	
	private UtilSql() {
		
	}

	public static final boolean connectionIsNull(final Connection connection) {
		return UtilObject.isNull(connection);
	}

	public static boolean connectionIsOpen(final Connection connection) {
		if (connectionIsNull(connection)) {

			throw TransformateCrossCuttingException.create(
					UtilSqlMessage.CONNECTION_IS_OPEN_TECHNICAL_NULL_CONNECTION_STRING,
					UtilSqlMessage.CONNECTION_IS_OPEN_USER_MESSAGE_STRING);
		}

		try {
			return !connection.isClosed();
		} catch (SQLException exception) {

			throw TransformateCrossCuttingException.create(UtilSqlMessage.CONNECTION_IS_OPEN_TECHNICAL_SQL_EXCEPTION_STRING,
					UtilSqlMessage.CONNECTION_IS_OPEN_USER_MESSAGE_STRING, exception);
		} catch (final Exception exception) {

			throw TransformateCrossCuttingException.create(UtilSqlMessage.CONNECTION_IS_OPEN_TECHNICAL_EXCEPTION_STRING,
					UtilSqlMessage.CONNECTION_IS_OPEN_USER_MESSAGE_STRING, exception);
		}
	}

	public static final void closeConnection(final Connection connection) {
		try {
			if (!connectionIsOpen(connection)) {
				connection.close();
			}
		} catch (TransformateCrossCuttingException exception) {
			throw exception;
		} catch (SQLException exception) {

			throw TransformateCrossCuttingException.create(UtilSqlMessage.CONNECTION_IS_OPEN_TECHNICAL_SQL_EXCEPTION_STRING,
					UtilSqlMessage.CONNECTION_IS_OPEN_USER_MESSAGE_STRING, exception);
		} catch (final Exception exception) {

			throw TransformateCrossCuttingException.create(UtilSqlMessage.CONNECTION_IS_OPEN_TECHNICAL_EXCEPTION_STRING,
					UtilSqlMessage.CONNECTION_IS_OPEN_USER_MESSAGE_STRING, exception);
		}
	}

	public static final void initTransaction(final Connection connection) throws SQLException {

		try {
			if (connectionIsOpen(connection)) {

			
				throw TransformateCrossCuttingException.create( UtilSqlMessage.TECHNICAL_PROBLEM_TO_INIT_TRANSACTION_CONNECTION,  UtilSqlMessage.TECHNICAL_TRY_INIT_TRANSACTION);
			}

			connection.setAutoCommit(false);
		} catch (SQLException exception) {

			throw exception;
		} catch (final Exception exception) {
			
			
			throw TransformateCrossCuttingException.create( UtilSqlMessage.TECHNICAL_PROBLEM_TO_INIT_TRANSACTION_CONNECTION,  UtilSqlMessage.TECHNICAL_TRY_INIT_TRANSACTION, exception);
		}

	

	}

	public static final void commitTransaction(final Connection connection) {

		try {
			if (connectionIsOpen(connection)) {
				
				throw TransformateCrossCuttingException.create(UtilSqlMessage.TECHNICAL_CONNECTION_IS_CLOSED_FOR_COMMIT_TRANSACTION, UtilSqlMessage.TECHNICAL_TRY_COMMIT_TRANSACTION);
				
			}
			connection.setAutoCommit(false);
		} catch (TransformateCrossCuttingException exception) {
			throw exception;
		}

		catch (final SQLException exception) {
			
			throw TransformateCrossCuttingException.create(UtilSqlMessage.CONNECTION_IS_OPEN_TECHNICAL_NULL_CONNECTION_STRING, UtilSqlMessage.CONNECTION_IS_OPEN_USER_MESSAGE_STRING);
		
		}

	}

	public static final void rollBackTransaction(final Connection connection) throws SQLException {
		try {
			if (!connectionIsOpen(connection)) {
	

				throw TransformateCrossCuttingException.create(UtilSqlMessage.TECHNICAL_CONNECTION_IS_CLOSED_FOR_ROLLBACK_TRANSACTION, UtilSqlMessage.TECHNICAL_TRY_ROLLBACK_TRANSACTION);
			}

			if (connection.getAutoCommit()) {
				
				throw TransformateCrossCuttingException.create(UtilSqlMessage.TECHNICAL_CONNECTION_IS_CLOSED_FOR_ROLLBACK_TRANSACTION,UtilSqlMessage.CONNECTION_IS_OPEN_TECHNICAL_EXCEPTION_STRING);
			
			}
		} finally {
			connection.rollback();
		}
	}

}
