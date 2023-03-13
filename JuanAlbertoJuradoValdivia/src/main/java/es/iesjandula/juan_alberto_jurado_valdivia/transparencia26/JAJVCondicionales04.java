package es.iesjandula.juan_alberto_jurado_valdivia.transparencia26;

import java.util.Scanner;

public class JAJVCondicionales04 {

	public static void main(String[] args) {
		
		int a,b,x,result;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce a: ");
		a=sc.nextInt();
		
		System.out.println("Introduce b: ");
		b=sc.nextInt();
		
		if(a==0) {
			
			System.out.println("Error"); 
			
		}else {
		
		x=(b*-1)/a;
		
		System.out.println("Solucion:"+ x);
		
		}
		
	}

}
