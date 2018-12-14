package Cafe; // Paquete Java

/**
 * Funcion de la Opcion 1 Visualizar productos
 * Copyright(©) 2018 Carlos_cg 
 * @author Carlos_cg
 * @version 3
 **/

import java.util.Scanner; // Importa la clase Scanner

public class FOpcion1{ // Clase FOpcion1

    // Atributos
	
	// No puede ser atributos privados por que se van a llamar mas adelante en MenuAdmin opcion2 

	// Inicialmente hay 50 Capsulas 
	public static int totalCapsulas = 50; 

	// Inicialmente hay 5000 militros de agua
	public static int totalAgua = 5000;  
	
	// Inicialmente hay 10 vasos 
	public static int totalVasos = 50;  

	// Getters y Setters
	
	// Getter que obtiene el total de capsulas
	public static int gettotalCapsulas() { 
		return totalCapsulas;
	} 
	
	// Setter que guarda el total de capsulas
	public static void settotalCapsulas(int vtotalCapsulas ) {
		totalCapsulas = vtotalCapsulas;
	} 
	
	// Getter que obtiene el total de agua
	public static int gettotalAgua() { 
		return totalAgua;
	} 
		
	// Setter que guarda el total de agua
	public static void settotalAgua(int vtotalAgua ) {
		totalAgua = vtotalAgua;
	} 
	
	// Getter que obtiene el total de vasos
	public static int gettotalVasos() { 
		return totalVasos;
	} 
	
	// Setter que guarda el total de vasos
	public static void settotalVasos(int vtotalVasos ) { 
		totalVasos = vtotalVasos;
	} 
	
	// Metodo main del programa java y ademas es un metodo recursivo ya que     
    // luego habra una opción que llame a FOpcion1
	public static void main (String[] args){
		int res = 1;		
		Opcion1Menu(res);
	}
		
    // Metodo MenuPrincipal que devuelve un valor de tipo entero que coincide 
    // con las opciones del menu
	public static void Opcion1Menu(int respuesta){
		
        Scanner entrada = new Scanner(System.in); // Clase Scanner entrada

        // Estructura de control While
        while (true) {
        	
            // Menu que ve el usuario
			System.out.println(" ____________________________________________________________ ");
			System.out.println(" |                                                          | ");
			System.out.println(" | Máquina de Café / Té                                     | ");
			System.out.println(" |__________________________________________________________| ");
			System.out.println(" |                                                          | ");
			System.out.println(" | Opcion 1 Visualizar productos                            | ");
			System.out.println(" |                                     Introduzca el código | ");
			System.out.println(" | Café                                                     | ");
			System.out.println(" | (1) Café con leche                       Precio: 1,20    | ");
			System.out.println(" | (2) Café Capuccino                       Precio: 1,20    | ");
			System.out.println(" | (3) Café Americano                       Precio: 1,20    | ");
			System.out.println(" |                                                          | ");
			System.out.println(" | Té                                                       | ");
			System.out.println(" | (4) Té de Manzanilla                     Precio: 1,20    | ");
			System.out.println(" | (5) Té de Menta                          Precio: 1,20    | ");
			System.out.println(" | (6) Té Verde                             Precio: 1,20    | ");
			System.out.println(" |__________________________________________________________| ");
			System.out.println(" | (7) Volver al menú principal                             | ");
			System.out.println(" |__________________________________________________________| ");
					
			// El dato que contiene el Scanner se le pasa a la variable respuesta  
			respuesta = entrada.nextInt();
						
	        // Estructura de control Switch con las opciones de los productos
			switch(respuesta) {
			
				case 1:
					System.out.println(" (1) Café con leche              Precio: 1,20");
					
			        // Estructura de control if, else if, else para controlar si hay 
					// consumibles para el producto 1

					if (totalCapsulas == 0 ) {
						System.out.println("No hay cápsulas");
				        // Llama al metodo main de la funcion FCancelarCapsulas
						FCancelarCapsulas.CancelarCapsulas(respuesta);
					}
					else if (totalAgua == 0 ) {
						System.out.println("No hay agua");
				        // Llama al metodo main de la funcion FCancelarAgua
						FCancelarAgua.CancelarAgua(respuesta);
					}
					else if(totalVasos == 0 ) {
						System.out.println("No hay vasos");
				        // Llama al metodo main de la funcion FCancelarVasos
						FCancelarVasos.CancelarVasos(respuesta);
					}
					else {
				        // Autodecremento (-1) totalCapsulas
						totalCapsulas--;
				        // Autodecremento (-40) militros por cafe con leche
						totalAgua-=40;
				        // Autodecremento (-1) de totalVasos
						totalVasos--;
						FOpcion2.Opcion2Menu(respuesta);
					}
										
					break;

				case 2:
					System.out.println(" (2) Café Capuccino              Precio: 1,20");					
					
					 // Estructura de control if, else if, else para controlar si hay 
					// consumibles para el producto 1

					if (totalCapsulas == 0 ) {
						System.out.println("No hay cápsulas");
				        // Llama al metodo main de la funcion FCancelarCapsulas
						FCancelarCapsulas.CancelarCapsulas(respuesta);
					}
					else if (totalAgua == 0 ) {
						System.out.println("No hay agua");
				        // Llama al metodo main de la funcion FCancelarAgua
						FCancelarAgua.CancelarAgua(respuesta);
					}
					else if(totalVasos == 0 ) {
						System.out.println("No hay vasos");
				        // Llama al metodo main de la funcion FCancelarVasos
						FCancelarVasos.CancelarVasos(respuesta);
					}
					else {
				        // Autodecremento (-1) totalCapsulas
						totalCapsulas--;
				        // Autodecremento (-20) militros por cafe capuccino
						totalAgua-=40;
				        // Autodecremento (-1) de totalVasos
						totalVasos--;
						FOpcion2.Opcion2Menu(respuesta);
					}
										
					break;

				case 3:
					System.out.println(" (3) Café Americano              Precio: 1,20");

					 // Estructura de control if, else if, else para controlar si hay 
					// consumibles para el producto 1

					if (totalCapsulas == 0 ) {
						System.out.println("No hay cápsulas");
				        // Llama al metodo main de la funcion FCancelarCapsulas
						FCancelarCapsulas.CancelarCapsulas(respuesta);
					}
					else if (totalAgua == 0 ) {
						System.out.println("No hay agua");
				        // Llama al metodo main de la funcion FCancelarAgua
						FCancelarAgua.CancelarAgua(respuesta);
					}
					else if(totalVasos == 0 ) {
						System.out.println("No hay vasos");
				        // Llama al metodo main de la funcion FCancelarVasos
						FCancelarVasos.CancelarVasos(respuesta);
					}
					else {
				        // Autodecremento (-1) totalCapsulas
						totalCapsulas--;
				        // Autodecremento (-70) militros por cafe americano
						totalAgua-=70;
				        // Autodecremento (-1) de totalVasos
						totalVasos--;
						FOpcion2.Opcion2Menu(respuesta);
					}
										
					break;
					
				case 4:
					System.out.println(" (4) Té de Manzanilla            Precio: 1,20");

					 // Estructura de control if, else if, else para controlar si hay 
					// consumibles para el producto 1

					if (totalCapsulas == 0 ) {
						System.out.println("No hay cápsulas");
				        // Llama al metodo main de la funcion FCancelarCapsulas
						FCancelarCapsulas.CancelarCapsulas(respuesta);
					}
					else if (totalAgua == 0 ) {
						System.out.println("No hay agua");
				        // Llama al metodo main de la funcion FCancelarAgua
						FCancelarAgua.CancelarAgua(respuesta);
					}
					else if(totalVasos == 0 ) {
						System.out.println("No hay vasos");
				        // Llama al metodo main de la funcion FCancelarVasos
						FCancelarVasos.CancelarVasos(respuesta);
					}
					else {
				        // Autodecremento (-1) totalCapsulas
						totalCapsulas--;
				        // Autodecremento (-100) militros por te de manzanilla
						totalAgua-=60;
				        // Autodecremento (-1) de totalVasos
						totalVasos--;
						FOpcion2.Opcion2Menu(respuesta);
					}
										
					break;
					
				case 5:
					System.out.println(" (5) Té de Menta                 Precio: 1,20");
					
					 // Estructura de control if, else if, else para controlar si hay 
					// consumibles para el producto 1

					if (totalCapsulas == 0 ) {
						System.out.println("No hay cápsulas");
				        // Llama al metodo main de la funcion FCancelarCapsulas
						FCancelarCapsulas.CancelarCapsulas(respuesta);
					}
					else if (totalAgua == 0 ) {
						System.out.println("No hay agua");
				        // Llama al metodo main de la funcion FCancelarAgua
						FCancelarAgua.CancelarAgua(respuesta);
					}
					else if(totalVasos == 0 ) {
						System.out.println("No hay vasos");
				        // Llama al metodo main de la funcion FCancelarVasos
						FCancelarVasos.CancelarVasos(respuesta);
					}
					else {
				        // Autodecremento (-1) totalCapsulas
						totalCapsulas--;
				        // Autodecremento (-100) militros por te de menta
						totalAgua-=100;
				        // Autodecremento (-1) de totalVasos
						totalVasos--;
						FOpcion2.Opcion2Menu(respuesta);
					}
										
					break;
					
				case 6:
					System.out.println(" (5) Té Verde                    Precio: 1,20");
					
					// Estructura de control if, else if, else para controlar si hay 
					// consumibles para el producto 1

					if (totalCapsulas == 0 ) {
						System.out.println("No hay cápsulas");
				        // Llama al metodo main de la funcion FCancelarCapsulas
						FCancelarCapsulas.CancelarCapsulas(respuesta);
					}
					else if (totalAgua == 0 ) {
						System.out.println("No hay agua");
				        // Llama al metodo main de la funcion FCancelarAgua
						FCancelarAgua.CancelarAgua(respuesta);
					}
					else if(totalVasos == 0 ) {
						System.out.println("No hay vasos");
				        // Llama al metodo main de la funcion FCancelarVasos
						FCancelarVasos.CancelarVasos(respuesta);
					}
					else {
				        // Autodecremento (-1) totalCapsulas
						totalCapsulas--;
				        // Autodecremento (-100) militros por te verde
						totalAgua-=100;
				        // Autodecremento (-1) de totalVasos
						totalVasos--;
						FOpcion2.Opcion2Menu(respuesta);
					}
										
					break;
					
				case 7:
					System.out.println(" (6) Volver al menú principal");
			        // Llama al metodo main de la funcion PMenuPrincipal
					PMenuPrincipal.MenuPrincipal(respuesta);
					break;
					
				// Zona de control por si no se introduce la opciones
				default:
					System.out.println("No existe la opción marcada, pruebe con las indicadas arriba");
					FOpcion1.Opcion1Menu(respuesta);
					break;
			}
		}
	}
}
