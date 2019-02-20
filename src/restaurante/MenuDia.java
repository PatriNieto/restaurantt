package restaurante;

public class MenuDia {
	
	//será hija de principal? 

		private String primerPlato;
		private String segundoPlato;
		private String postre;
		private String bebida;
		private float precio;
		
		
		//constructor menu del día
		public MenuDia(String primerPlato, String segundoPlato, String postre, String bebida, float precio) {
			super();
			this.primerPlato = primerPlato;
			this.segundoPlato = segundoPlato;
			this.postre = postre;
			this.bebida = bebida;
			this.precio = precio;
			
			
			
	
			//yo entiendo que se podrá moficicar
			
			
		}

		@Override
		public String toString() {
			return "MenuDia [primerPlato=" + primerPlato + ", segundoPlato=" + segundoPlato + ", postre=" + postre
					+ ", bebida=" + bebida + ", precio=" + precio + "]";
		}

		//getters and setters
		public String getPrimerPlato() {
			return primerPlato;
		}


		public void setPrimerPlato(String primerPlato) {
			this.primerPlato = primerPlato;
		}


		public String getSegundoPlato() {
			return segundoPlato;
		}


		public void setSegundoPlato(String segundoPlato) {
			this.segundoPlato = segundoPlato;
		}


		public String getPostre() {
			return postre;
		}


		public void setPostre(String postre) {
			this.postre = postre;
		}


		public String getBebida() {
			return bebida;
		}


		public void setBebida(String bebida) {
			this.bebida = bebida;
		}


		public float getPrecio() {
			return precio;
		}


		public void setPrecio(float precio) {
			this.precio = precio;
		}
		
		

}
