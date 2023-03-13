package es.iesjandula.juan_alberto_jurado_valdivia.transparencia27;

import java.util.Scanner;

public class JAJVCondicionales10 {

	public static void main(String[] args) {
		
		int n,cifra;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		n=sc.nextInt();
		
		
		if(n>0 && n<10) {
			
			System.out.println("El numero "+ n +" tiene una cifra ");
		
		}else if(n>=10 && n<100) {
			
			cifra=n/10;
			
			System.out.println("El numero "+ n +" tiene dos cifras ");
			
		}else if(n>=100 && n<1000) {
			
			cifra=n/100;
			
			System.out.println("El numero "+ n +" tiene tres cifras ");
			
		}else if(n>=1000 && n<10000) {
			
			cifra=n/1000;
			
			System.out.println("El numero "+ n +" tiene cuatro cifras ");
			
		}else if(n>=10000 && n<100000) {
			
			cifra=n/10000;
			
			System.out.println("El numero "+ n +" tiene cinco cifras ");
			
		}else {
			
			System.out.println("El numero "+ n +" esta fuera del rango ");
			
		}

	}

}
