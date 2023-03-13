package es.iesjandula.juan_alberto_jurado_valdivia.transparencia9;

import java.util.Scanner;

public class JAJVPrimerosPasosPseInt10 {

	public static void main(String[] args) {
		
		double horas,salario;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la cantidad de euros a convertir: ");
		horas=sc.nextDouble();
		
		salario = horas*12;
		System.out.println("Salario semanal: "+ salario + " euros ");
		

	}

}
