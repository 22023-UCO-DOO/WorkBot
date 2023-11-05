package co.edu.uco.workbot.crosscutting.util;

import java.util.UUID;

import co.edu.uco.workbot.crosscutting.exception.concrete.CrossCuttingWorkBotException;
import co.edu.uco.workbot.crosscutting.mensaje.CatalogoMensajes;
import co.edu.uco.workbot.crosscutting.mensaje.enumerator.CodigoMensaje;

public class UtilUUID {

	private static final String UUID_POR_DEFECTO_COMO_TEXTO = "0000000-0000-0000-0000-00000000";
	private static final UUID UUID_POR_DEFECTO = UUID.fromString(UUID_POR_DEFECTO_COMO_TEXTO);
	public static final String PATTERN_UUID_MAXIMO="^[0-9A-Fa-f]+$";
	private UtilUUID() {
		super();
	}
	
	public static final UUID asignarUUIDPorDefecto() {
		return UUID_POR_DEFECTO;
	}

	public static final UUID obtenerUUIDDefecto(final UUID value) {
		return UtilObjeto.obtenerValorDefecto(value, UUID_POR_DEFECTO);
	}

	public static final UUID getNewUUID() {
		UUID uuid;

		do {
			uuid = UUID.randomUUID();

		} while (isDefualtUUID(uuid));
		return UUID.randomUUID();

	}

	public static final String obtenerUUIDComoTexto(final UUID valor) {
		return obtenerUUIDDefecto(valor).toString();
	}

	public static final UUID obtenerUUIDDeTexto(final String valor) {
		try {
			return UUID.fromString(UtilTexto.obtenerValorDefecto(valor, UUID_POR_DEFECTO_COMO_TEXTO));
		} catch (final IllegalCallerException exception) {
			throw CrossCuttingWorkBotException.crear(exception,
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000004),
					"No ha sido posible crear el UUID, porfavor revisar de nuevo en la cracion de UUID");

		} catch (final Exception exception) {
			throw CrossCuttingWorkBotException.crear(exception,
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000004),
					"Ha ocurrido un error inesperado en la creacion de UUID porfavor revisar que todo este correcto. En caso de que no sea asi contactar al programador");
		}

	}

	public static final boolean isDefualtUUID(final UUID value) {
		return UUID_POR_DEFECTO.equals(value);
	}
	public static final boolean esUUIDPorDefecto(final UUID valor) {
		return valor.equals(UUID_POR_DEFECTO);
	}
}
