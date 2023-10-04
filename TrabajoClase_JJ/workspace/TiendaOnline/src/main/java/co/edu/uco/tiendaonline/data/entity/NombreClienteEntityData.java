package co.edu.uco.tiendaonline.data.entity;

public class NombreClienteEntityData {
	private String primerNombre;
	private String segundoNombre;
	private String primerApellido;
	private String segundoApellido;

	private NombreClienteEntityData(String primerNombre, String segundoNombre, String primerApellido,
			String segundoApellido) {
		setPrimerNombre(primerNombre);
		setSegundoNombre(segundoNombre);
		setPrimerApellido(primerApellido);
		setSegundoApellido(segundoApellido);
	}

	private final void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	private final void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	private final void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	private final void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public final String getPrimerNombre() {
		return primerNombre;
	}

	public final String getSegundoNombre() {
		return segundoNombre;
	}

	public final String getPrimerApellido() {
		return primerApellido;
	}

	public final String getSegundoApellido() {
		return segundoApellido;
	}
	
	
}