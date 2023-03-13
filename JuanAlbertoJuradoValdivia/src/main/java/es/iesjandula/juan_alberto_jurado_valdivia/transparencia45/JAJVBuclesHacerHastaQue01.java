package es.iesjandula.juan_alberto_jurado_valdivia.transparencia45;

import java.util.Scanner;

public class JAJVBuclesHacerHastaQue01 {

	public static void main(String[] args) {
		
		double factorial=1;
		double x;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		x=sc.nextDouble();
		
		while(x!=0) {
		
			factorial=factorial*x;
			x--;			
			System.out.println(x);
		}		
	}
}
