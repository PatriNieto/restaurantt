import java.util.Scanner;

import restaurante.Restaurante;
import restaurante.Restaurante;

public class Principal {
	
	public static void main(String[] args) {
		
		//creamos un restaurante utilizando el constructor  --> el restaurante 1
		
		Direccion direcc1 = new Direccion("Manzana", 19, 28015, "Madrid", "Madrid");
		
		MenuDia menu1 = new MenuDia("Pasta con tomate", "Filete de pollo", "Natillas", "Vino", 10);
		
		Restaurante rest1 = new Restaurante("Casa"
				+ " Federica", "Tradicional", direcc1 ,
				"915 42 96 75", "casafede@gmail.com", "www.casafederica.com", 10, menu1);
		
		//System.out.println(direcc1.toString());
		System.out.println(rest1.toString());
		
		Scanner lector = new Scanner(System.in);
		do {
			System.out.println("iRestaurante");
			System.out.println("Pulsa 1 para añadir un restaurante");
			System.out.println("Pulsa 2 para ver el listado de restaurantes");
			System.out.println("--------------------------------------------");
		
		} while ();
		
	}

}
