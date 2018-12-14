package Cafe; // Paquete Java

/**
 * Funcion de la Opcion 3 Menu administrador
 * Copyright(©) 2018 Carlos_cg 
 * @author Carlos_cg
 * @version 3
 **/

import java.util.Scanner; // Importa la clase Scanner

public class FMenuAdmin{ // Clase FMenuAdmin
	
	
  	// Metodo RecogerDinero que hace la funcion de delay o retardo de la ejecuccion
	public static void RecogerDinero() throws InterruptedException{ 

		
		System.out.println(" | Sacando dinero, espere...                                | ");						

  	  	// Estructura de control for para controlar el tiempo de ejecucion

		for( int i=0; i<5; i++){
			
			System.out.println(" |                                                          | ");
			Thread.sleep(1000); // Tiempo en milisegundos que espera a ejecutar
		}
		System.out.println(" | Por favor, recoja el dinero                              | ");
		System.out.println(" |__________________________________________________________| ");
		

	}
	
  	// Metodo ApagarMaquina que hace la funcion de delay o retardo de la ejecuccion
	public static void ApagarMaquina() throws InterruptedException{ 
				
		System.out.println(" ____________________________________________________________ ");
		System.out.println(" |                                                          | ");
		System.out.println(" | Máquina de Café / Té                                     | ");
		System.out.println(" |__________________________________________________________| ");
		System.out.println(" |                                                          | ");
		System.out.println(" | Menú Administrador                                       | ");
		System.out.println(" |                                                          | ");
		System.out.println(" | (9) Apagar máquina                                       | ");
		System.out.println(" |                                                          | ");
		System.out.println(" | Apagando máquina...                                      | ");				

	  	 // Estructura de control for para controlar el tiempo de ejecucion
		for( int i=0; i<5; i++){
				
			System.out.println(" |                                                          | ");
			Thread.sleep(1000); // Tiempo en milisegundos que espera a ejecutar
		}
	
		System.out.println(" | Máquina apagada                                          | ");
		System.out.println(" |__________________________________________________________| ");

	}
	
	// Metodo main del programa java y ademas es un metodo recursivo ya que     
    // luego habra una opcion que llame a FMenuAdmin
	public static void main (String[] args){
		int res = 1;		
		OpcionMenuAdmin(res);
	}
		
    // Metodo MenuPrincipal que devuelve un valor de tipo entero que coincide 
    // con las opciones del menu
	public static void OpcionMenuAdmin(int respuesta){
		
        Scanner entrada = new Scanner(System.in); // Clase Scanner entrada
		
        // Estrucutura de control while
        while (true) {

            // Menu que ve el usuario

			System.out.println(" ____________________________________________________________ ");
			System.out.println(" |                                                          | ");
			System.out.println(" | Máquina de Café / Té                                     | ");
			System.out.println(" |__________________________________________________________| ");
			System.out.println(" |                                                          | ");
			System.out.println(" | Menú Administrador                                       | ");
			System.out.println(" |                                                          | ");
			System.out.println(" | (1) Ver recaudación diaria                               | ");
			System.out.println(" | (2) Ver disponibles (vasos, nivel de agua y capsulas )   | ");
			System.out.println(" | (3) Añadir vasos                                         | ");
			System.out.println(" | (4) Añadir agua                                          | ");
			System.out.println(" | (5) Añadir capsulas                                      | ");
			System.out.println(" | (6) Recoger recaudación                                  | ");
			System.out.println(" | (7) Salir (Vuelve al login)                              | ");
			System.out.println(" | (8) Volver al menú principal                             | ");
			System.out.println(" | (9) Apagar Máquina                                       | ");
			System.out.println(" |__________________________________________________________| ");
					
		// El dato que contiene el Scanner se le pasa a la variable respuesta  
		respuesta = entrada.nextInt();
			
			// Estructura de control Switch con las opciones del 1 al 9
			switch(respuesta) {
			
				case 1:
					
					// 1 Ver recaudacion diaria

					System.out.println(" ____________________________________________________________ ");
					System.out.println(" |                                                          | ");
					System.out.println(" | Máquina de Café / Té                                     | ");
					System.out.println(" |__________________________________________________________| ");
					System.out.println(" |                                                          | ");
					System.out.println(" | Menú Administrador                                       | ");
					System.out.println(" |                                                          | ");
					System.out.println(" | (1) Ver recaudacion diaria                               | ");
					System.out.println(" |                                                          | ");
					System.out.println(" | Valor total                                              | ");
					
					int valortotal = FOpcion2.gettotal() ;
					System.out.println(" | " + valortotal + " Céntimos(€)                                          | " );
					System.out.println(" |__________________________________________________________| ");
					
					break;

				case 2:
	
					// 2 Ver disponibles

					System.out.println(" ____________________________________________________________ ");
					System.out.println(" |                                                          | ");
					System.out.println(" | Máquina de Café / Té                                     | ");
					System.out.println(" |__________________________________________________________| ");
					System.out.println(" |                                                          | ");
					System.out.println(" | Menú Administrador                                       | ");
					System.out.println(" |                                                          | ");
					System.out.println(" | (2) Ver disponibles (vasos, nivel de agua y capsulas)    | ");
					System.out.println(" |                                                          | ");
					System.out.println(" | Vasos restantes                                          | ");
					System.out.println(" | " +  FOpcion1.totalVasos + "                                                       | " );
					System.out.println(" |                                                          | " );
					System.out.println(" | Agua restante                                            | ");
					System.out.println(" | " +  FOpcion1.totalAgua + " (ml)                                                | " );
					System.out.println(" |                                                          | ");
					System.out.println(" | Cápsulas restantes                                       | ");
					System.out.println(" | " +  FOpcion1.totalCapsulas + "                                                       | " );
					System.out.println(" |__________________________________________________________| ");
					
					break;
	
				case 3:
						
					// 3 Añadir vasos

					System.out.println(" ____________________________________________________________ ");
					System.out.println(" |                                                          | ");
					System.out.println(" | Máquina de Café / Té                                     | ");
					System.out.println(" |__________________________________________________________| ");
					System.out.println(" |                                                          | ");
					System.out.println(" | (3) Añadir vasos                                         | ");
					System.out.println(" |                                                          | ");
	
					int vasos = FOpcion1.gettotalVasos();
					String vasosleidos;
					
					System.out.println(" | ¿Cuantos vasos desea añadir? Máx 100 vasos               | ");
					System.out.println(" |__________________________________________________________| ");
	
					Scanner leervasos = new Scanner(System.in);
					
					vasosleidos = leervasos.nextLine();
					
					int vasostotales = vasos + Integer.parseInt(vasosleidos);
	
					if (vasostotales > 100 ) {
						System.out.println(" Excede el máximo permitido (Máx 100) ");
						System.out.println(" No se puede introducir " + vasostotales + " ");
						
					} else {
						System.out.println("Ha introducido: " + vasosleidos + " Vasos" );
						FOpcion1.settotalVasos(vasostotales);
						System.out.println("Hay en total " + vasostotales + " Vasos" );
	
					}
					
					break;
						
				case 4:
					
					// 4 Añadir agua

					System.out.println(" ____________________________________________________________ ");
					System.out.println(" |                                                          | ");
					System.out.println(" | Máquina de Café / Té                                     | ");
					System.out.println(" |__________________________________________________________| ");
					System.out.println(" |                                                          | ");
					System.out.println(" | (4) Añadir agua                                          | ");
					System.out.println(" |                                                          | ");
	
					int agua = FOpcion1.gettotalAgua();
					String agualeida;
					
					System.out.println(" | ¿Cuantos litros desea añadir? Máx 6 litros de agua       | ");
					System.out.println(" |__________________________________________________________| ");
	
					Scanner leeragua = new Scanner(System.in);
					
					agualeida = leeragua.nextLine();
					
					int aguatotal = agua + Integer.parseInt(agualeida);
	
					if (aguatotal > 6000 ) { // 6000 ml = 6 litros
						
						System.out.println(" Excede el máximo permitido (Máx 6 Litros) ");
						System.out.println(" No se puede introducir " + aguatotal + " ");
						
					} else {
											
						System.out.println("Ha introducido: " + agualeida + " mililitros  " );
						FOpcion1.settotalAgua(aguatotal);
						System.out.println("Hay en total " + aguatotal + " agua" );

					}
					
					break;
					
				case 5:
					
					// 5 Añadir capsulas

					System.out.println(" ____________________________________________________________ ");
					System.out.println(" |                                                          | ");
					System.out.println(" | Máquina de Café / Té                                     | ");
					System.out.println(" |__________________________________________________________| ");
					System.out.println(" |                                                          | ");
					System.out.println(" | (5) Añadir capsulas                                      | ");
					System.out.println(" |                                                          | ");
	
					int capsulas = FOpcion1.gettotalCapsulas();
					String capsulasleidas;
					
					System.out.println(" | ¿Cuántas capsulas desea añadir? Máx 100 cápsulas         | ");
					System.out.println(" |__________________________________________________________| ");
	
					Scanner leercapsulas = new Scanner(System.in);
					
					capsulasleidas = leercapsulas.nextLine();
					
					int capsulastotales = capsulas + Integer.parseInt(capsulasleidas);
	
					if (capsulastotales > 100 ) {
						System.out.println(" Excede el máximo permitido (Máx 100) ");
						System.out.println(" No se puede introducir " + capsulastotales + " ");
						
					} else {
						System.out.println("Ha introducido: " + capsulasleidas + " Capsulas" );
						FOpcion1.settotalCapsulas(capsulastotales);
						System.out.println("Hay en total " + capsulastotales + " Capsulas" );
					
					}
					
					break;
						
				case 6:
					
					// 6 Recoger recaudacion

					System.out.println(" ____________________________________________________________ ");
					System.out.println(" |                                                          | ");
					System.out.println(" | Máquina de Café / Té                                     | ");
					System.out.println(" |__________________________________________________________| ");
					System.out.println(" |                                                          | ");
					System.out.println(" | Menú Administrador                                       | ");
					System.out.println(" |                                                          | ");
					System.out.println(" | (6) Recoger recaudacion                                  | ");
					System.out.println(" |                                                          | ");
					System.out.println(" | Valor total                                              | ");
					
					int valortotal2 = FOpcion2.gettotal() ;
					System.out.println(" | " + valortotal2 + " Céntimos(€)                                          | " );
	
					try {
						FMenuAdmin.RecogerDinero();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}				
					
					FOpcion2.settotal(0) ;
					
					break;
							
				case 7:
					
					// 7 Vuelve al login

					System.out.println("(7) Salir (vuelve al login)");
					FOpcion3.Opcion3Menu(respuesta);
					break;
						
				case 8:
					
					// 8 Vuelve al menu principal

					System.out.println("(8) Cerrar (vuelve al menú principal)");
					PMenuPrincipal.MenuPrincipal(respuesta);
					break;
						
				case 9:
					
					// 9 Apaga la máquina con System.exit(0);

					try {
						FMenuAdmin.ApagarMaquina();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}				
					System.exit(0);
					break;
					
				// Zona de control por si no se introduce las opciones
				default:
					System.out.println("No existe la opción marcada, pruebe con las indicadas arriba");
					FMenuAdmin.OpcionMenuAdmin(respuesta);
					break;
			}
        }
	}
}
