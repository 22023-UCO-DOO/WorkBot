package co.edu.uco.workbot.data.entity;

import java.util.UUID;

import co.edu.uco.workbot.data.entity.support.CorreoElectronicoMiembroEntity;
import co.edu.uco.workbot.data.entity.support.NombreCompletoMiembroEntity;
import co.edu.uco.workbot.data.entity.support.NumeroCelularMiembroEntity;

public class MiembroEntity {

	private UUID id;
	private TipoDocumentoEntity tipoDocumentoEntity;
	private String identificacion;
	private NombreCompletoMiembroEntity nombreCompleto;
	private CorreoElectronicoMiembroEntity correo;
	private NumeroCelularMiembroEntity celular;

	public MiembroEntity(UUID id, TipoDocumentoEntity tipoDocumentoEntity, String identificacion,
			NombreCompletoMiembroEntity nombreCompleto, CorreoElectronicoMiembroEntity correo,
			NumeroCelularMiembroEntity celular) {
		setId(id);
		setTipoDocumentoEntity(tipoDocumentoEntity);
		setIdentificacion(identificacion);
		setNombreCompleto(nombreCompleto);
		setCorreo(correo);
		setCelular(celular);

	}

	public static final MiembroEntity create(UUID id, TipoDocumentoEntity tipoDocumentoEntity, String identificacion,
			NombreCompletoMiembroEntity nombreCompleto, CorreoElectronicoMiembroEntity correo,
			NumeroCelularMiembroEntity celular) {
		return new MiembroEntity(id, tipoDocumentoEntity, identificacion, nombreCompleto, correo, celular);
	}

	public final UUID getId() {
		return id;
	}

	public final String getIdentificacion() {
		return identificacion;
	}

	public final TipoDocumentoEntity getTipoDocumentoEntity() {
		return tipoDocumentoEntity;
	}

	public final NombreCompletoMiembroEntity getNombreCompleto() {
		return nombreCompleto;
	}

	public final CorreoElectronicoMiembroEntity getCorreo() {
		return correo;
	}

	public final NumeroCelularMiembroEntity getCelular() {
		return celular;
	}

	private final void setId(UUID id) {
		this.id = id;
	}

	private final void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	private final void setTipoDocumentoEntity(TipoDocumentoEntity tipoDocumentoEntity) {
		this.tipoDocumentoEntity = tipoDocumentoEntity;
	}

	private final void setNombreCompleto(NombreCompletoMiembroEntity nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	private final void setCorreo(CorreoElectronicoMiembroEntity correo) {
		this.correo = correo;
	}

	private final void setCelular(NumeroCelularMiembroEntity celular) {
		this.celular = celular;
	}

}
