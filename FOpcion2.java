package Cafe; // Paquete Java

/**
 * Funcion de la Opcion 2 Sacar Cafe / Te
 * Copyright(©) 2018 Carlos_cg 
 * @author Carlos_cg
 * @version 1
 **/

import java.util.Scanner; // Importa la clase Scanner

public class FOpcion2{  // Clase FOpcion2 
	
	// Variable que almacena el total de monedas introducidas
	private static int total = 0; 
	
	// Getter que obtiene el total de monedas
	public static int gettotal() { 
		return total;
	} 
	
	// Setter que guarda el total de monedas
	public static void settotal(int vtotal ) { 
		total = vtotal;
	} 
	
	// Metodo que hace la funcion de delay o retardo de la ejecuccion
	public static void TiempoEjecucion() throws InterruptedException{ 
		
		System.out.println(" | Sacando producto, espere...                              | ");						

		for( int i=0; i<5; i++){
			
			System.out.println(" |                                                          | ");
			Thread.sleep(1000); // Tiempo en milisegundos que espera a ejecutar
		}
		System.out.println(" | Por favor, recoja el producto                            | ");
	}
	
	
	// Metodo main del programa java y ademas es un metodo recursivo ya que     
    // luego habra una opcion que llame al FOpcion2
	public static void main (String[] args){
		int res = 1;		
		Opcion2Menu(res);
	}
	
    // Metodo Opcion2Menu que devuelve un valor de tipo entero que coincide 
    // con las opciones del menu
	public static void Opcion2Menu(int respuesta){
		
		// Precio total de los productos 1,20 = 120 centimos
		int precio = 120;
		int contador = 0;
		boolean maximo = false;
		int cambio = 0;

		Scanner entrada = new Scanner(System.in); // Clase Scanner entrada
		
		 // Estructura de control while
		while (maximo == false) {
			
	        // Menu que ve el usuario
			System.out.println(" ____________________________________________________________ ");
			System.out.println(" |                                                          | ");
			System.out.println(" | Máquina de Café / Té                                     | ");
			System.out.println(" |__________________________________________________________| ");
			System.out.println(" |                                                          | ");
			System.out.println(" | Opcion 2 Sacar Café / Té                                 | ");
			System.out.println(" |                                     Introduzca el código | ");
			System.out.println(" |                        Introduzca la cantidad en monedas | ");
			System.out.println(" |                   Solo acepta las monedas que se indican | ");
			System.out.println(" |                                                          | ");
			System.out.println(" | (1) Moneda de  5 céntimos(€)                             | ");
			System.out.println(" | (2) Moneda de 10 céntimos(€)                             | ");
			System.out.println(" | (3) Moneda de 20 céntimos(€)                             | ");
			System.out.println(" | (4) Moneda de 50 céntimos(€)                             | ");
			System.out.println(" | (5) Moneda de  1 (€)                                     | ");
			System.out.println(" | (6) Moneda de  2 (€)                                     | ");
			System.out.println(" | (7) Cancelar                                             | ");
			System.out.println(" |__________________________________________________________| ");
					
			// El dato que contiene el Scanner se le pasa a la variable respuesta  
			respuesta = entrada.nextInt();
			
	        // Estructura de control Switch con las 7 opciones validas
			switch(respuesta) {
			
				// case1 para moneda de 5 cts
				case 1:
					contador = contador + 5 ;
				
					if (contador >= precio ){
							
						maximo = true;
						cambio = contador - precio;
						total = total + (contador - cambio) ;
						
						// Mensaje que ve el usuario

						System.out.println(" ____________________________________________________________ ");
						System.out.println(" |                                                          | ");
						System.out.println(" | Máquina de Café / Té                                     | ");
						System.out.println(" |__________________________________________________________| ");
						System.out.println(" |                                                          | ");
						System.out.println(" | Devolviendo dinero introducido:                          | ");
						System.out.println(" | " + cambio +" céntimos(€)                                           | " );
					
						try {
							// Llama al metedo .TiempoEjecucion
							FOpcion2.TiempoEjecucion();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
												
						System.out.println(" |__________________________________________________________| ");
						
						// Clase Scanner entradaUsuario
						Scanner entradaUsuario = new Scanner(System.in);
						
						// Variable de tipo String respuestaUsuario
						String respuestaUsuario;
						
						// Mensaje que ve el usuario

						System.out.println(" |                                                          | ");
						System.out.println(" | Desea algún otro producto???                             | ");
						System.out.println(" |__________________________________________________________| ");
						System.out.println(" | Introduzca la siguiente opciones                         | ");
						System.out.println(" | (Si) (No)                                                | ");
						System.out.println(" |__________________________________________________________| ");
							
						// El dato que contiene el Scanner se le pasa a la variable respuesta  
						respuestaUsuario = entradaUsuario.nextLine();
							
							// Estructura de control if-else  
							if (respuestaUsuario.equals("Si")){
								System.out.println("Volviendo al menú con los productos");
						        // Llama al metodo main de la funcion FOpcion1
								FOpcion1.Opcion1Menu(respuesta);
							}
							else {
								System.out.println("Volviendo al menú principal");
						        // Llama al metodo main de la funcion PMenuPrincipal
								PMenuPrincipal.MenuPrincipal(respuesta);
							}					
						} 	
					System.out.println("Ha introducido una moneda de 5 céntimos(€)");
					break;
					
				// case2 para moneda de 10 cts
				case 2:
					contador = contador + 10 ;
						
					if (contador >= precio ){
						
						maximo = true;
						cambio = contador - precio;
						total = total + (contador - cambio) ;
						
						// Mensaje que ve el usuario

						System.out.println(" ____________________________________________________________ ");
						System.out.println(" |                                                          | ");
						System.out.println(" | Máquina de Café / Té                                     | ");
						System.out.println(" |__________________________________________________________| ");
						System.out.println(" |                                                          | ");
						System.out.println(" | Devolviendo dinero introducido:                          | ");
						System.out.println(" | " + cambio +" céntimos(€)                                           | " );
					
						try {
							// Llama al metedo .TiempoEjecucion
							FOpcion2.TiempoEjecucion();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
												
						System.out.println(" |__________________________________________________________| ");
						
						// Clase Scanner entradaUsuario
						Scanner entradaUsuario = new Scanner(System.in);
						
						// Variable de tipo String respuestaUsuario
						String respuestaUsuario;
						
						// Mensaje que ve el usuario

						System.out.println(" |                                                          | ");
						System.out.println(" | Desea algún otro producto???                             | ");
						System.out.println(" |__________________________________________________________| ");
						System.out.println(" | Introduzca la siguiente opciones                         | ");
						System.out.println(" | (Si) (No)                                                | ");
						System.out.println(" |__________________________________________________________| ");
							
						// El dato que contiene el Scanner se le pasa a la variable respuesta  
						respuestaUsuario = entradaUsuario.nextLine();
							
					    	// Estructura de control if-else  
							if (respuestaUsuario.equals("Si")){
								System.out.println("Volviendo al menú con los productos");
						        // Llama al metodo main de la funcion FOpcion1
								FOpcion1.Opcion1Menu(respuesta);
							}
							else {
								System.out.println("Volviendo al menú principal");
						        // Llama al metodo main de la funcion PMenuPrincipal
								PMenuPrincipal.MenuPrincipal(respuesta);
							}					
						} 	
					System.out.println("Ha introducido una moneda de 10 céntimos(€)");
					break;
					
				// case3 para moneda de 20 cts	
				case 3:
					contador = contador + 20 ;
					
					if (contador >= precio ){
						
						maximo = true;
						cambio = contador - precio;
						total = total + (contador - cambio) ;
						
						// Mensaje que ve el usuario

						System.out.println(" ____________________________________________________________ ");
						System.out.println(" |                                                          | ");
						System.out.println(" | Máquina de Café / Té                                     | ");
						System.out.println(" |__________________________________________________________| ");
						System.out.println(" |                                                          | ");
						System.out.println(" | Devolviendo dinero introducido:                          | ");
						System.out.println(" | " + cambio +" céntimos(€)                                           | " );
					
						try {
							// Llama al metedo .TiempoEjecucion
							FOpcion2.TiempoEjecucion();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
												
						System.out.println(" |__________________________________________________________| ");
						
						// Clase Scanner entradaUsuario
						Scanner entradaUsuario = new Scanner(System.in);
						
						// Variable de tipo String respuestaUsuario
						String respuestaUsuario;
						
						// Mensaje que ve el usuario

						System.out.println(" |                                                          | ");
						System.out.println(" | Desea algún otro producto???                             | ");
						System.out.println(" |__________________________________________________________| ");
						System.out.println(" | Introduzca la siguiente opciones                         | ");
						System.out.println(" | (Si) (No)                                                | ");
						System.out.println(" |__________________________________________________________| ");
							
						// El dato que contiene el Scanner se le pasa a la variable respuesta  
						respuestaUsuario = entradaUsuario.nextLine();
							
							// Estructura de control if-else  
							if (respuestaUsuario.equals("Si")){
								System.out.println("Volviendo al menú con los productos");
						        // Llama al metodo main de la funcion FOpcion1
								FOpcion1.Opcion1Menu(respuesta);
							}
							else {
								System.out.println("Volviendo al menú principal");
						        // Llama al metodo main de la funcion PMenuPrincipal
								PMenuPrincipal.MenuPrincipal(respuesta);
							}					
						} 	
					System.out.println("Ha introducido una moneda de 20 céntimos(€)");
					break;
					
				// case4 para moneda de 50 cts
				case 4:
					contador = contador + 50 ;
					
					if (contador >= precio ){
						
						maximo = true;
						cambio = contador - precio;
						total = total + (contador - cambio) ;
						
						// Mensaje que ve el usuario

						System.out.println(" ____________________________________________________________ ");
						System.out.println(" |                                                          | ");
						System.out.println(" | Máquina de Café / Té                                     | ");
						System.out.println(" |__________________________________________________________| ");
						System.out.println(" |                                                          | ");
						System.out.println(" | Devolviendo dinero introducido:                          | ");
						System.out.println(" | " + cambio +" céntimos(€)                                           | " );
					
						try {
							// Llama al metedo .TiempoEjecucion
							FOpcion2.TiempoEjecucion();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
												
						System.out.println(" |__________________________________________________________| ");
						
						// Clase Scanner entradaUsuario
						Scanner entradaUsuario = new Scanner(System.in);
						
						// Variable de tipo String respuestaUsuario
						String respuestaUsuario;
						
						// Mensaje que ve el usuario

						System.out.println(" |                                                          | ");
						System.out.println(" | Desea algún otro producto???                             | ");
						System.out.println(" |__________________________________________________________| ");
						System.out.println(" | Introduzca la siguiente opciones                         | ");
						System.out.println(" | (Si) (No)                                                | ");
						System.out.println(" |__________________________________________________________| ");
							
						// El dato que contiene el Scanner se le pasa a la variable respuesta  
						respuestaUsuario = entradaUsuario.nextLine();
						
					    	// Estructura de control if-else  
							if (respuestaUsuario.equals("Si")){
								System.out.println("Volviendo al menú con los productos");
						        // Llama al metodo main de la funcion FOpcion1
								FOpcion1.Opcion1Menu(respuesta);
							}
							else {
								System.out.println("Volviendo al menú principal");
						        // Llama al metodo main de la funcion PMenuPrincipal
								PMenuPrincipal.MenuPrincipal(respuesta);
							}					
						} 	
					System.out.println("Ha introducido una moneda de 50 céntimos(€)");
					break;
					
				// case5 para moneda de 100 cts
				case 5:
					contador = contador + 100 ;
					
					if (contador >= precio ){
						
						maximo = true;
						cambio = contador - precio;
						total = total + (contador - cambio) ;
						
						// Mensaje que ve el usuario

						System.out.println(" ____________________________________________________________ ");
						System.out.println(" |                                                          | ");
						System.out.println(" | Máquina de Café / Té                                     | ");
						System.out.println(" |__________________________________________________________| ");
						System.out.println(" |                                                          | ");
						System.out.println(" | Devolviendo dinero introducido:                          | ");
						System.out.println(" | " + cambio +" céntimos(€)                                           | " );
					
						try {
							// Llama al metedo .TiempoEjecucion
							FOpcion2.TiempoEjecucion();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
												
						System.out.println(" |__________________________________________________________| ");
						
						// Clase Scanner entradaUsuario
						Scanner entradaUsuario = new Scanner(System.in);
						
						// Variable de tipo String respuestaUsuario
						String respuestaUsuario;
						
						// Mensaje que ve el usuario

						System.out.println(" |                                                          | ");
						System.out.println(" | Desea algún otro producto???                             | ");
						System.out.println(" |__________________________________________________________| ");
						System.out.println(" | Introduzca la siguiente opciones                         | ");
						System.out.println(" | (Si) (No)                                                | ");
						System.out.println(" |__________________________________________________________| ");
							
						// El dato que contiene el Scanner se le pasa a la variable respuesta  
						respuestaUsuario = entradaUsuario.nextLine();
							
					    	// Estructura de control if-else  
							if (respuestaUsuario.equals("Si")){
								System.out.println("Volviendo al menú con los productos");
						        // Llama al metodo main de la funcion FOpcion1
								FOpcion1.Opcion1Menu(respuesta);
							}
							else {
								System.out.println("Volviendo al menú principal");
						        // Llama al metodo main de la funcion PMenuPrincipal
								PMenuPrincipal.MenuPrincipal(respuesta);
							}					
						} 	
					System.out.println("Ha introducido una moneda de 1(€)");
					break;
				
				// case1 para moneda de 200 cts

				case 6:
					contador = contador + 200 ;
					if (contador >= precio ){
						
						maximo = true;
						cambio = contador - precio;
						total = total + (contador - cambio) ;
						
						System.out.println("Ha introducido una moneda de 2 (€)");

						// Mensaje que ve el usuario

						System.out.println(" ____________________________________________________________ ");
						System.out.println(" |                                                          | ");
						System.out.println(" | Máquina de Café / Té                                     | ");
						System.out.println(" |__________________________________________________________| ");
						System.out.println(" |                                                          | ");
						System.out.println(" | Devolviendo dinero introducido:                          | ");
						System.out.println(" | " + cambio +" céntimos(€)                                           | " );
					
						try {
							// Llama al metedo .TiempoEjecucion
							FOpcion2.TiempoEjecucion();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
												
						System.out.println(" |__________________________________________________________| ");
						
						// Clase Scanner entradaUsuario
						Scanner entradaUsuario = new Scanner(System.in);
						
						// Variable de tipo String respuestaUsuario
						String respuestaUsuario;
						
						// Mensaje que ve el usuario

						System.out.println(" |                                                          | ");
						System.out.println(" | Desea algún otro producto???                             | ");
						System.out.println(" |__________________________________________________________| ");
						System.out.println(" | Introduzca la siguiente opciones                         | ");
						System.out.println(" | (Si) (No)                                                | ");
						System.out.println(" |__________________________________________________________| ");
							
						// El dato que contiene el Scanner se le pasa a la variable respuesta  
						respuestaUsuario = entradaUsuario.nextLine();
							
						    // Estructura de control if-else  
							if (respuestaUsuario.equals("Si")){
								System.out.println("Volviendo al menú con los productos");
						        // Llama al metodo main de la funcion FOpcion1
								FOpcion1.Opcion1Menu(respuesta);
							}
							else {
								System.out.println("Volviendo al menú principal");
						        // Llama al metodo main de la funcion PMenuPrincipal
								PMenuPrincipal.MenuPrincipal(respuesta);
							}					
						} 	
					System.out.println("Ha introducido una moneda de 1(€)");
					break;
				
				case 7:
					
			        // Llama al metodo main de la funcion FCancelar
					FCancelar.OpcionCancelar(respuesta);

						// Estructura de control if-else  
						if (contador > 0 ) {

							// Mensaje que ve el usuario

							System.out.println(" | Se procede a la devolución de su dinero                  | ");
							System.out.println(" |__________________________________________________________| ");
							System.out.println("                                                              ");
							System.out.println(" Devolviendo dinero introducido: " + contador + " céntimos(€) ");
							System.out.println(" Disculpe las molestias                                       ");
							System.out.println("                                                              ");
					
						} else {
							
							// Mensaje que ve el usuario

							System.out.println("                                                              ");
							System.out.println(" Disculpe las molestias                                       ");
							System.out.println("                                                              ");
						}

						contador = 0;
						cambio = 0;
						maximo = false;
					
					break;
					
				default:
					System.out.println("No existe la opción marcada, pruebe con las indicadas arriba");
			        // Llama al metodo main de la funcion FOpcion2
					FOpcion2.Opcion2Menu(respuesta);
					break;
			}

		}
		System.out.println("Devolviendo el cambio: "+ cambio + "  céntimos(€)");						
	}
}

