package es.iesjandula.juan_alberto_jurado_valdivia.transparencia37;

import java.util.Scanner;

public class JAJVBuclesMientras02 {

	public static void main(String[] args) {
		
		int num;
		int x=(int) (Math.random()*10+1);
		int cont=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		num=sc.nextInt();
		System.out.println(" ");
		
		while(num != x) {
			
			cont++;
			
			if(num>x) {
				
			System.out.println("El numero aleatorio es mas pequero ");
			System.out.println("Introduce otro numero: ");
			num=sc.nextInt();
			
			}else {
				
				System.out.println("El numero aleatorio es mayor ");
				System.out.println("Introduce otro numero: ");
				num=sc.nextInt();
				
			}
			
		}
		
		System.out.println("Ha aceptado el numero");
		System.out.println("Intentos: "+cont);

	}

}
