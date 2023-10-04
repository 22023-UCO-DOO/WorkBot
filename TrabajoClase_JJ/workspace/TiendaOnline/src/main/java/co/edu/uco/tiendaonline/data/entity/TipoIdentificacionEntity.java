package co.edu.uco.tiendaonline.data.entity;

import java.util.UUID;

public final class TipoIdentificacionEntity {
	private UUID id;
	private String codigo;
	private String nombre;
	private boolean estado;

	private TipoIdentificacionEntity(UUID id, String codigo, String nombre, boolean estado) {
		setId(id);
		setCodigo(codigo);
		setNombre(nombre);
		setEstado(estado);
	}

	public static final TipoIdentificacionEntity Create(UUID id, String codigo, String nombre, boolean estado) {
		return new TipoIdentificacionEntity(id, codigo, nombre, estado);
	}

	private final void setId(UUID id) {
		this.id = id;
	}

	private final void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	private final void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private final void setEstado(boolean estado) {
		this.estado = estado;
	}

	private final UUID getId() {
		return id;
	}

	private final String getCodigo() {
		return codigo;
	}

	private final String getNombre() {
		return nombre;
	}

	private final boolean isEstado() {
		return estado;
	}

}
