package es.iesjandula.juan_alberto_jurado_valdivia.transparencia9;

import java.util.Scanner;

public class JAJVPrimerosPasosPseInt07 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		int x;
		double result;
		
		System.out.println("Introduce un numero: ");
		x=sc.nextInt();
		
		result=Math.pow(x, 2)+x+1;
		
		System.out.println("El resultado de la ecuacion es: "+result);
		
	}

}
