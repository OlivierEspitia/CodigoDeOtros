package org.generation;

import java.util.Scanner;

public class Codigo4 {
	public static void main(String[] args) {
	//no existia el metodo main asi que lo cree y meti todo el codigo dentro de el 
		//importe la herramienta Scanner 
		//cambie los "==" por .queals 

	Scanner s = new Scanner(System.in); // agregue el System.in

	System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	String j1 = s.nextLine();

	System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
	String j2 = s.nextLine();

	if(j1.equals(j2))
	{
		System.out.println("Empate");
	}else
	{
		int g = 2;

		switch (j1) {
		case "piedra":
			if (j2.equals("tijeras")) {
				g = 1;
			}
			break; // agregue un break

		case "papel":
			if (j2.equals("piedra")) {
				g = 1;
			} // Agregue etiqureta de cierre
			break;
		case "tijera":
			if (j2.equals("papel")) {
				g = 1;
			}
			break;
		default:
		}
		System.out.println("Gana el jugador " + g);
	}
	}
}
