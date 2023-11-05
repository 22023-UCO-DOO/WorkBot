package co.edu.uco.workbot.service.domain.miembro;

import java.util.UUID;

import co.edu.uco.workbot.crosscutting.util.UtilTexto;
import co.edu.uco.workbot.crosscutting.util.UtilUUID;
import co.edu.uco.workbot.service.domain.miembro.support.celular.NumeroCelularMiembroDomain;
import co.edu.uco.workbot.service.domain.miembro.support.correo.CorreoElectronicoMiembroDomain;
import co.edu.uco.workbot.service.domain.miembro.support.nombre.NombreCompletoMiembroDomain;
import co.edu.uco.workbot.service.domain.tipodocumento.TipoDocumentoDomain;

public class MiembroDomain {

	private UUID id;
	private TipoDocumentoDomain tipoDocumentoDomain;
	private String identificacion;
	private NombreCompletoMiembroDomain nombreCompleto;
	private CorreoElectronicoMiembroDomain correo;
	private NumeroCelularMiembroDomain celular;

	public MiembroDomain(UUID id, TipoDocumentoDomain tipoDocumentoDomain, String identificacion,
			NombreCompletoMiembroDomain nombreCompleto, CorreoElectronicoMiembroDomain correo,
			NumeroCelularMiembroDomain celular) {
		setId(id);
		setTipoDocumentoEntity(tipoDocumentoDomain);
		setIdentificacion(identificacion);
		setNombreCompleto(nombreCompleto);
		setCorreo(correo);
		setCelular(celular);

	}

	public static final MiembroDomain create(UUID id, TipoDocumentoDomain tipoDocumentoDomain, String identificacion,
			NombreCompletoMiembroDomain nombreCompleto, CorreoElectronicoMiembroDomain correo,
			NumeroCelularMiembroDomain celular) {
		return new MiembroDomain(id, tipoDocumentoDomain, identificacion, nombreCompleto, correo, celular);
	}

	public final UUID getId() {
		return id;
	}

	public final String getIdentificacion() {
		return identificacion;
	}

	public final TipoDocumentoDomain getTipoDocumentoEntity() {
		return tipoDocumentoDomain;
	}

	public final NombreCompletoMiembroDomain getNombreCompleto() {
		return nombreCompleto;
	}

	public final CorreoElectronicoMiembroDomain getCorreo() {
		return correo;
	}

	public final NumeroCelularMiembroDomain getCelular() {
		return celular;
	}

	private final void setId(UUID id) {
		this.id = UtilUUID.obtenerUUIDDefecto(id);
	}

	private final void setIdentificacion(String identificacion) {
		this.identificacion = UtilTexto.aplicarTrim(identificacion);
	}

	private final void setTipoDocumentoEntity(TipoDocumentoDomain tipoDocumentoDomain) {
		this.tipoDocumentoDomain = tipoDocumentoDomain;
	}

	private final void setNombreCompleto(NombreCompletoMiembroDomain nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	private final void setCorreo(CorreoElectronicoMiembroDomain correo) {
		this.correo = correo;
	}

	private final void setCelular(NumeroCelularMiembroDomain celular) {
		this.celular = celular;
	}

}
