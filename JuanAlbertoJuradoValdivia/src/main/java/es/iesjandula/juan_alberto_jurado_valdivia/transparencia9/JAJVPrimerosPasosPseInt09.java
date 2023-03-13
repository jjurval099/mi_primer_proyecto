package es.iesjandula.juan_alberto_jurado_valdivia.transparencia9;

import java.util.Scanner;

public class JAJVPrimerosPasosPseInt09 {

	public static void main(String[] args) {
		
		double eur, pesetas;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la cantidad de euros a convertir");
		eur=sc.nextDouble();
		
		pesetas = eur * 166.38;
		System.out.println("Los euros introducidos equivalen a " +pesetas +" pesetas");

	}

}
