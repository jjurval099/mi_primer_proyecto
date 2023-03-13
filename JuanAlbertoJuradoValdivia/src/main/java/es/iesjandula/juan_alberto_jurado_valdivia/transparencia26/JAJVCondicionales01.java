package es.iesjandula.juan_alberto_jurado_valdivia.transparencia26;

import java.util.Scanner;

public class JAJVCondicionales01 {

	public static void main(String[] args) {
		
		int n;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce un dia: ");

		n=sc.nextInt();
		
		if(n>=1 && n<=5) {
			
			if(n==1) {
				
				System.out.println("Lunes a primera hay bases de datos");
				
			}else if(n==2){
				
				System.out.println("Martes a primera hay programacion");
				
			}else if(n==3){
				
				System.out.println("Miercoles a primera hay sistemas informaticos");
				
			}else if(n==4){
				
				System.out.println("Jueves a primera hay fol");
				
			}else{
				
				System.out.println("Viernes a primera hay programacion");			
				
			}
		}else {
			
			System.out.println("Fuera de rango");
		}
		
		sc.close();
			
	}

}
