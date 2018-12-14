package Cafe; // Paquete Java
 
/** 
 * Procedimiento principal que contiene el menu principal por el cual
 * se acceden a los submenús.
 * Copyright(©) 2018 Carlos Castillo  
 * @author Carlos Castillo
 * @version 2.0
 **/

import java.util.Scanner; // Importa la clase Scanner

public class PMenuPrincipal { // Clase PMenuPrincipal 

	// Metodo main del programa java y ademas es un metodo recursivo ya que     
    // luego habra una opcion que llame al PMenuPrincipal
	public static void main (String[] args){ 	
		int res = 1;		
		MenuPrincipal(res);
	}

    // Metodo MenuPrincipal que devuelve un valor de tipo entero que coincide 
    // con las opciones del menu
	public static void MenuPrincipal (int res){ 
		
        Scanner entrada = new Scanner(System.in); // Clase Scanner entrada
        
        int respuesta; // Variable respuesta de tipo int

        
        // Menu que ve el usuario
		System.out.println(" ____________________________________________________________ ");
		System.out.println(" |                                                          | ");
		System.out.println(" | Máquina de Café / Té                                     | ");
		System.out.println(" | Firmware v1.0 Para máquina Café/Té EDM 2018/2019         | ");
		System.out.println(" | Programador: Carlos Castillo                             | ");
		System.out.println(" |__________________________________________________________| ");
		System.out.println(" |                                                          | ");
		System.out.println(" | Introduce opción                                         | ");
		System.out.println(" |                             (1) Visualizar productos     | ");
		System.out.println(" |                             (2) Sacar Café/Té de máquina | ");
		System.out.println(" |                             (3) Administrar máquina      | ");
		System.out.println(" |__________________________________________________________| ");
					
		// El dato que contiene el Scanner se le pasa a la variable respuesta  
        respuesta = entrada.nextInt();
			
        // Estructura de control Switch con las 3 opciones
		switch(respuesta) {
			
			case 1:
				System.out.println(" ------------------------------- (1) Sacar Café/Té de máquina");
		        // Llama al metodo main de la funcion FOpcion1
				FOpcion1.Opcion1Menu(respuesta);
				break;

			case 2:
				System.out.println(" ------------------------------- (2) Sacar Café/Té de máquina");
		        // Llama al metodo main de la funcion FOpcion2P
				FOpcion2P.Opcion2Menu(respuesta);
				break;

			case 3:
				System.out.println(" ------------------------------- (3) Administrar máquina");
		        // Llama al metodo main de la funcion FOpcion3
				FOpcion3.Opcion3Menu(respuesta);
				break;
					
		    // Zona de control por si no se introduce la opcion 1, 2 o 3
			default:
				System.out.println(" No existe la opción marcada, pruebe con las indicadas arriba");
		        // Llama al metodo main de la funcion PMenuPrincipal
				PMenuPrincipal.MenuPrincipal(respuesta);
				break;
		}
	}
}