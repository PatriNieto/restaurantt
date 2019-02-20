package restaurante;

public class Cliente {
	
	private String nombreCliente;
	private Direccion direccionCliente;
	private String usuario;
	private String contrasena;
	
	
	//constructor
	public Cliente(String nombreCliente, Direccion direccionCliente, String usuario, String contrasena) {
		super();
		this.nombreCliente = nombreCliente;
		this.direccionCliente = direccionCliente;
		this.usuario = usuario;
		this.contrasena = contrasena;
	}


	public String getNombreCliente() {
		return nombreCliente;
	}


	public Direccion getDireccionCliente() {
		return direccionCliente;
	}


	public String getUsuario() {
		return usuario;
	}


	public String getContrasena() {
		return contrasena;
	}
	
	//getters y setters
	
	

}
