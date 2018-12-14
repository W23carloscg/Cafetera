package Cafe; // Paquete cafe

/**
 * Funcion de la Opcion 2 Que da información al usuario sobre las monedas que admite la máquina.
 * Copyright(©) 2018 Carlos_cg 
 * @author Carlos_cg
 * @version 1
 **/

import java.util.Scanner; // Importa la clase Scanner

public class FOpcion2P { // Clase FOpcion2P 
	
	// Metodo main del programa java y ademas es un metodo recursivo ya que     
    // luego habra una opcion que llame a FOpcion2
	public static void main (String[] args){
		int res = 1;		
		Opcion2Menu(res);
	}
			
	// Metodo MenuPrincipal que devuelve un valor de tipo entero que coincide 
    // con las opciones del menu
	public static void Opcion2Menu(int respuesta){
			
        Scanner entrada = new Scanner(System.in); // Clase Scanner entrada
			
            // Menu que ve el usuario
			System.out.println(" ____________________________________________________________ ");
			System.out.println(" |                                                          | ");
			System.out.println(" | Máquina de Café / Té                                     | ");
			System.out.println(" |__________________________________________________________| ");
			System.out.println(" |                                                          | ");
			System.out.println(" | Opcion 2 Sacar Café / Té                                 | ");
			System.out.println(" |                                                          | ");
			System.out.println(" |                   Solo acepta las monedas que se indican | ");
			System.out.println(" |                                                          | ");
			System.out.println(" | Moneda de  5 céntimos(€)                                 | ");
			System.out.println(" | Moneda de 10 céntimos(€)                                 | ");
			System.out.println(" | Moneda de 20 céntimos(€)                                 | ");
			System.out.println(" | Moneda de 50 céntimos(€)                                 | ");
			System.out.println(" | Moneda de  1 (€)                                         | ");
			System.out.println(" |                                                          |");
			System.out.println(" | (1) Volver al menú principal                             | ");
			System.out.println(" |__________________________________________________________| ");
						
			// El dato que contiene el Scanner se le pasa a la variable respuesta  
			respuesta = entrada.nextInt();
			
	            // Estructura de control Switch con la opcion
				switch(respuesta) {
				
					case 1:
				        // Llama al metodo main de la funcion PMenuPrincipal
						PMenuPrincipal.MenuPrincipal(respuesta);

					default:
						System.out.println("No existe la opción marcada, pruebe con las indicadas arriba");
				        // Llama al metodo main de la funcion FOpcion2P
						FOpcion2P.Opcion2Menu(respuesta);
						break;
				}

			}
		
	}

