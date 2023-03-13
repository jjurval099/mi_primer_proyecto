package es.iesjandula.juan_alberto_jurado_valdivia.transparencia27;

import java.util.Scanner;

public class JAJVCondicionales07 {

	public static void main(String[] args) {
		
		int n;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		n=sc.nextInt();
		
		if(n%2==0 && n%5==0){
			
			System.out.println("El numero "+ n +" es par y  divisible entre 5");
			
		}else if(n%2==0) {
			
			System.out.println("El numero "+ n +" es par");
			
		}else if(n%5==0) {
			
			System.out.println("El numero "+ n +" es divisible entre 5");
			
		}else {
			
			System.out.println("El numero "+ n +" no es par mi divisible entre 5");
			
		}
	}
}
