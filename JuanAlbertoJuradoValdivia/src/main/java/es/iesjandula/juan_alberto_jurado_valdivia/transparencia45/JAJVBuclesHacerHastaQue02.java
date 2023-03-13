package es.iesjandula.juan_alberto_jurado_valdivia.transparencia45;

import java.util.Scanner;

public class JAJVBuclesHacerHastaQue02 {

	public static void main(String[] args) {

		int x,y,result=1;
		
		Scanner sc=new Scanner(System.in);
		
		do {
		System.out.println("Introduce la base: ");
		x=sc.nextInt();
		
		System.out.println("Introduce el exponente: ");
		y=sc.nextInt();
		}while(x<0 && y<0);
		
		while(y!=0) {
			
			result=result*x;			
			y--;			
		}
		
		System.out.println("Resultado: "+result);
	}
}
