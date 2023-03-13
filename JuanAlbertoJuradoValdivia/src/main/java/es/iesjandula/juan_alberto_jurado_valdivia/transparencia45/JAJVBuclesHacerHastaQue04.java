package es.iesjandula.juan_alberto_jurado_valdivia.transparencia45;

import java.util.Scanner;

public class JAJVBuclesHacerHastaQue04 {

	public static void main(String[] args) {
		
		int x,y,dividendo,divisor,cociente=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		x=sc.nextInt();
		
		System.out.println("Introduce otro numero: ");
		y=sc.nextInt();
		
			while(x>=y){
				cociente++;
				x=x-y;
			}
		
			System.out.println("Conciente: "+ cociente +" Resto: "+x);
	}
}
