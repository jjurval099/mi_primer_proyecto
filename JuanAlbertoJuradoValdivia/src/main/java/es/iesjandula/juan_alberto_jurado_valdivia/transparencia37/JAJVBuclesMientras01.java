package es.iesjandula.juan_alberto_jurado_valdivia.transparencia37;

import java.util.Scanner;

public class JAJVBuclesMientras01 {

	public static void main(String[] args) {
		
		int num,cont=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		num=sc.nextInt();
		
		while(cont<num) {
			
			cont++;
			
			System.out.print("* ");	
			
		}

	}

}
