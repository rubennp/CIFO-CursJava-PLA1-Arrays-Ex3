package main;

import java.util.Scanner;

public class Main {

	/*
	 * Pide 5 nombres de productos y los guarda en Array.
	 * Si usuario introduce nombre repetido	debe volver a pedir.	
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String[] productos = new String[5];
		boolean repetido = false;				// para comprobar productos repetidos
		
		for (int p = 0; p < 5; p++) {
			do {
				System.out.println("* Introduce el producto nuevo n." + (p+1) + ":");
				String producto = in.nextLine();
				
				if (p == 0) productos[p] = producto;			// si es el 1r producto, lo guarda directamente
				else {
					for (int c = 0; c < p; c++) {				// recorre los productos guardados
						if (producto.equals(productos[c])) {	// si el introducido ya está no lo guarda
							System.out.println("¡Este producto está repetido!");
							repetido = true;					// se queda en el bucle do-while
							break;								// deja de buscar otro repetido
					} else {									// si no encuentra producto en los guardados, lo guarda
							productos[p] = producto;
							repetido = false;					// sale del bucle
						}
					}
				}
				
			} while (repetido);									// repite la introducción mientras esté repetido						
		}
		
		// imprime Array con productos introducidos sin repeticiones
		System.out.print("->");
		for (String pr : productos) System.out.print(pr + " ");
		
		in.close();
	}
}
