package Cafe; // Paquete Java

/**
 * Funcion Cancelar capsulas
 * Copyright(©) 2018 Carlos_cg 
 * @author Carlos_cg
 * @version 1
 **/

public class FCancelarCapsulas{ // Clase FCancelarAguaCapsulas
		
	// Metodo main del programa java y ademas es un metodo recursivo ya que     
    // luego habra una opcion que llame a FCancelarCapsulas
	public static void main (String[] args){
		int res = 1;		
		CancelarCapsulas(res);
	}
	
    // Metodo CancelarCapsulas que devuelve un mensaje de error
	public static void CancelarCapsulas(int respuesta){
			
		System.out.println(" ____________________________________________________________ ");
		System.out.println(" |                                                          | ");
		System.out.println(" | Máquina de Café / Té                                     | ");
		System.out.println(" |__________________________________________________________| ");
		System.out.println(" |                                                          | ");
		System.out.println(" | No se ha podido completar el pedido por:                 | ");
		System.out.println(" |                                                          | ");
		System.out.println(" | ######################## error 01                        | ");
		System.out.println(" | ########################                                 | ");
		System.out.println(" | ########################                                 | ");
		System.out.println(" |                                                          | ");
		System.out.println(" | Operación cancelada :C                                   | ");
		System.out.println(" |                                                          | ");
		System.out.println(" |__________________________________________________________| ");

					
	}
}