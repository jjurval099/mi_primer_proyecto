package es.iesjandula.juan_alberto_jurado_valdivia.transparencia27;

import java.util.Scanner;

public class JAJVCondicionales08 {

	public static void main(String[] args) {

		int n,modulo;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		n=sc.nextInt();
			
		modulo=n%10;
		
		System.out.println("La ultima cifra de  numero es: "+ modulo);
		sc.close();
	}
}
