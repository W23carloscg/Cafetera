package Cafe; // Paquete Java

/**
 * Funcion de la Opcion 3 Login del Administrador.
 * El usario introduce un nombre de usuario (que no se oculta) y ademas comprueba que el usuario es correcto.
 * El usario introduce una contraseña (que si se oculta) y ademas comprueba que la contraseña es correcta.
 * Copyright(©) 2018 Carlos_cg 
 * @author Carlos_cg
 * @version 4
 **/
 
import java.util.Scanner;


public class FOpcion3 { // Clase FOpcion3
	
	// Metodo main del programa java y ademas es un metodo recursivo ya que     
    // luego habra una opcion que llame a FOpcion3
	public static void main (String[] args){
		int res = 1;				
		Opcion3Menu(res);
	}
	
    // Metodo que muestra el login
	public static void Opcion3Menu(int respuesta){
	
		Scanner login = new Scanner(System.in); // Clase Scanner login
		
		// Dos variables String user = usuario y pass = contraseña
		String user, pass;
		
		// Mensaje que ve el usuario
		System.out.println(" ____________________________________________________________ ");
		System.out.println(" |                                                          | ");
		System.out.println(" | Máquina de Café / Té                                     | ");
		System.out.println(" |__________________________________________________________| ");
		System.out.println(" |                                                          | ");
		System.out.println(" | Opcion 3 Administrar Máquina                             | ");
		System.out.println(" |__________________________________________________________| ");
		System.out.println(" ");
		
		// Mensaje que pide el nombre del usuario
		System.out.println("Introduce el nombre de usuario: ");
		
    	// Scanner lee el nombre de usuario y guarda lo que contiene en la variable user
		user = login.nextLine();
		
		// Mensaje que pide la contraseña
		System.out.println("Introduce la contraseña");
		
	 	// Scanner lee el la contraseña y guarda lo que contiene en la variable pass
		pass = login.nextLine();
		
		// Estructura de control if else que controla que el nombre de usuario y contraseña son correctos
    	// En este caso el nombre de usuario es Carlos y la contraseña Carlos
		
		if ( user.equals("Carlos") && (pass.equals("Carlos"))){
		
			// Mensaje que ve el usuario

			System.out.println(" ____________________________________________________________ ");
            System.out.println(" | Usuario y contraseña correctos :D                        | ");
			System.out.println(" |                                                          | ");
            System.out.println(" | Bienvenido Adminstrador                                  | ");
			System.out.println(" |__________________________________________________________| ");
			
	        // Llama al metodo main de la funcion FMenuAdmin
			FMenuAdmin.OpcionMenuAdmin(respuesta);
		}
		else {
			System.out.println ("Usuario o Contraseña incorrectos");
	        // Llama al metodo main de la funcion PMenuPrincipal
			PMenuPrincipal.MenuPrincipal(respuesta);

		}
	}
}
