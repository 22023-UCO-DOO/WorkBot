package co.edu.uco.workbot.crosscutting.mensaje;

import co.edu.uco.workbot.crosscutting.exception.concrete.CrossCuttingWorkBotException;
import co.edu.uco.workbot.crosscutting.mensaje.enumerator.CategoriaMensaje;
import co.edu.uco.workbot.crosscutting.mensaje.enumerator.CodigoMensaje;
import co.edu.uco.workbot.crosscutting.mensaje.enumerator.TipoMensaje;
import co.edu.uco.workbot.crosscutting.util.UtilObjeto;
import co.edu.uco.workbot.crosscutting.util.UtilTexto;

public final class Mensaje {

	private CodigoMensaje codigo;
	private TipoMensaje tipo;
	private CategoriaMensaje categoria;
	private String contenido;

	private Mensaje(final CodigoMensaje codigo, final TipoMensaje tipo, final CategoriaMensaje categoria,
			final String contenido) {
		setCodigo(codigo);
		setTipo(tipo);
		setCategoria(categoria);
		setContenido(contenido);
	}

	public static final Mensaje crear(final CodigoMensaje codigo, final TipoMensaje tipo,
			final CategoriaMensaje categoria, final String contenido) {
		return new Mensaje(codigo, tipo, categoria, contenido);
	}

	private final void setCodigo(CodigoMensaje codigo) {

		if (UtilObjeto.esNulo(codigo)) {

			throw CrossCuttingWorkBotException.crear(
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000004),
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000001));
		}
		this.codigo = UtilObjeto.obtenerValorDefecto(codigo, null);
	}

	private final void setTipo(TipoMensaje tipo) {
		this.tipo = UtilObjeto.obtenerValorDefecto(tipo, TipoMensaje.USUARIO);
	}

	private final void setCategoria(CategoriaMensaje categoria) {
		this.categoria = UtilObjeto.obtenerValorDefecto(categoria, CategoriaMensaje.FATAL);
	}

	private final void setContenido(String contenido) {
		this.contenido = UtilTexto.aplicarTrim(contenido);
	}

	public final CodigoMensaje getCodigo() {
		return codigo;
	}

	public final TipoMensaje getTipo() {
		return tipo;
	}

	public final CategoriaMensaje getCategoria() {
		return categoria;
	}

	public final String getContenido() {
		return contenido;
	}

}
