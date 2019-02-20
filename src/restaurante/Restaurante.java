package restaurante;

public class Restaurante {
	
	//propiedades
		private String nombreRestaurante;
		private String tipoComida;
		private Direccion direccion;
		private String tlfnContacto;
		private String emailContacto;
		private String sitioWeb;
		private float precioMedio;
		//private Menu menu;
		private MenuDia menuDia;
		
		
		//constructor
		public Restaurante(String nombreRestaurante, String tipoComida, Direccion direccion, String tlfnContacto,
				String emailContacto, String sitioWeb, float precioMedio, MenuDia menuDia) {
			super();
			this.nombreRestaurante = nombreRestaurante;
			this.tipoComida = tipoComida;
			this.direccion = direccion;
			this.tlfnContacto = tlfnContacto;
			this.emailContacto = emailContacto;
			this.sitioWeb = sitioWeb;
			this.precioMedio = precioMedio;
			this.menuDia = menuDia;
		}
		

		
		
		@Override
		public String toString() {
			return "Restaurante [nombreRestaurante=" + nombreRestaurante + ", tipoComida=" + tipoComida + ", direccion="
					+ direccion + ", tlfnContacto=" + tlfnContacto + ", emailContacto=" + emailContacto + ", sitioWeb="
					+ sitioWeb + ", precioMedio=" + precioMedio + ", menuDia=" + menuDia + "]";
		}



		
		//getters and setters
		
		public MenuDia getMenuDia() {
			return menuDia;
		}


		public void setMenuDia(MenuDia menuDia) {
			this.menuDia = menuDia;
		}


		public String getNombreRestaurante() {
			return nombreRestaurante;
		}


		public String getTipoComida() {
			return tipoComida;
		}


		public Direccion getDireccion() {
			return direccion;
		}


		public String getTlfnContacto() {
			return tlfnContacto;
		}


		public String getEmailContacto() {
			return emailContacto;
		}


		public String getSitioWeb() {
			return sitioWeb;
		}


		public float getPrecioMedio() {
			return precioMedio;
		}
		
	

		}
		

		
		

