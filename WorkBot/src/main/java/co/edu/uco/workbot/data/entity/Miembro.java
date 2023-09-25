package co.edu.uco.workbot.data.entity;

import java.util.UUID;

public class Miembro {

	private UUID id;
	private TipoDocumento tipoDocumento;
	private String identificacion;
	private String nombre;
	private String apellido;
	private String correo;

	public Miembro(UUID id, TipoDocumento tipoDocumento, String identificacion, String nombre, String apellido,
			String correo) {
		setId(id);
		setTipoDocumento(tipoDocumento);
		setIdentificacion(identificacion);
		setNombre(nombre);
		setApellido(apellido);
		setCorreo(correo);
	}

	public static final Miembro create(UUID id, TipoDocumento tipoDocumento, String identificacion, String nombre, String apellido,
			String correo) {
		return new Miembro(id, tipoDocumento, identificacion, nombre, apellido, correo);
	}
	
	public final UUID getId() {
		return id;
	}

	public final TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public final String getIdentificacion() {
		return identificacion;
	}

	public final String getNombre() {
		return nombre;
	}

	public final String getApellido() {
		return apellido;
	}

	public final String getCorreo() {
		return correo;
	}

	private final void setId(UUID id) {
		this.id = id;
	}

	private final void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	private final void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	private final void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private final void setApellido(String apellido) {
		this.apellido = apellido;
	}

	private final void setCorreo(String correo) {
		this.correo = correo;
	}

}
