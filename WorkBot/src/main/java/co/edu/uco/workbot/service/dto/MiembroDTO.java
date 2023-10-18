package co.edu.uco.workbot.service.dto;

import java.util.UUID;

import co.edu.uco.workbot.crosscutting.util.UtilTexto;
import co.edu.uco.workbot.crosscutting.util.UtilUUID;

import co.edu.uco.workbot.service.dto.support.CorreoElectronicoMiembroDTO;
import co.edu.uco.workbot.service.dto.support.NombreCompletoMiembroDTO;
import co.edu.uco.workbot.service.dto.support.NumeroCelularMiembroDTO;

public class MiembroDTO {

	private UUID id;
	private TipoDocumentoDTO tipoDocumentoDTO;
	private String identificacion;
	private NombreCompletoMiembroDTO nombreCompleto;
	private CorreoElectronicoMiembroDTO correo;
	private NumeroCelularMiembroDTO celular;
	
	public MiembroDTO() {
		setId(UtilUUID.asignarUUIDPorDefecto());
		setTipoDocumentoEntity(new TipoDocumentoDTO());
		setIdentificacion(UtilTexto.VACIO);
		setNombreCompleto(new NombreCompletoMiembroDTO());
		setCorreo(new CorreoElectronicoMiembroDTO());
		setCelular(new NumeroCelularMiembroDTO());
	}

	public MiembroDTO(UUID id, TipoDocumentoDTO tipoDocumentoDTO, String identificacion,
			NombreCompletoMiembroDTO nombreCompleto, CorreoElectronicoMiembroDTO correo,
			NumeroCelularMiembroDTO celular) {
		setId(id);
		setTipoDocumentoEntity(tipoDocumentoDTO);
		setIdentificacion(identificacion);
		setNombreCompleto(nombreCompleto);
		setCorreo(correo);
		setCelular(celular);

	}

	public static final MiembroDTO create(UUID id, TipoDocumentoDTO tipoDocumentoDTO, String identificacion,
			NombreCompletoMiembroDTO nombreCompleto, CorreoElectronicoMiembroDTO correo,
			NumeroCelularMiembroDTO celular) {
		return new MiembroDTO(id, tipoDocumentoDTO, identificacion, nombreCompleto, correo, celular);
	}

	public final UUID getId() {
		return id;
	}

	public final String getIdentificacion() {
		return identificacion;
	}

	public final TipoDocumentoDTO getTipoDocumentoEntity() {
		return tipoDocumentoDTO;
	}

	public final NombreCompletoMiembroDTO getNombreCompleto() {
		return nombreCompleto;
	}

	public final CorreoElectronicoMiembroDTO getCorreo() {
		return correo;
	}

	public final NumeroCelularMiembroDTO getCelular() {
		return celular;
	}

	public final MiembroDTO setId(UUID id) {
		this.id = UtilUUID.obtenerUUIDDefecto(id);return this;
	}

	public final MiembroDTO setIdentificacion(String identificacion) {
		this.identificacion = UtilTexto.aplicarTrim(identificacion);return this;
	}

	public final MiembroDTO setTipoDocumentoEntity(TipoDocumentoDTO tipoDocumentoDTO) {
		this.tipoDocumentoDTO = tipoDocumentoDTO;return this;
	}

	public final MiembroDTO setNombreCompleto(NombreCompletoMiembroDTO nombreCompleto) {
		this.nombreCompleto = nombreCompleto;return this;
	}

	public final MiembroDTO setCorreo(CorreoElectronicoMiembroDTO correo) {
		this.correo = correo;return this;
	}

	public final MiembroDTO setCelular(NumeroCelularMiembroDTO celular) {
		this.celular = celular;return this;
	}

}
