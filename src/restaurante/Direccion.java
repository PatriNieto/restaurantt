package restaurante;

public class Direccion {
	
	// TODO Auto-generated method stub
	
			private String calle;
			private int numero;
			private int codigoPostal;
			private String localidad;
			private String provincia;
			
			
			
			//constructor
			public Direccion(String calle, int numero, int codigoPostal, String localidad, String provincia) {
				super();
				this.calle = calle;
				this.numero = numero;
				this.codigoPostal = codigoPostal;
				this.localidad = localidad;
				this.provincia = provincia;
			}

			
			public String toString() {
				String mensaje = " Direccion [" + calle + " " + numero + ", " + codigoPostal + " " + localidad +" , " + provincia + " ] ";
					return mensaje;
			}
			



			public String getCalle() {
				return calle;
			}



			public int getNumero() {
				return numero;
			}



			public int getCodigoPostal() {
				return codigoPostal;
			}



			public String getLocalidad() {
				return localidad;
			}



			public String getProvincia() {
				return provincia;
			}
			
			
			
			
	

}
