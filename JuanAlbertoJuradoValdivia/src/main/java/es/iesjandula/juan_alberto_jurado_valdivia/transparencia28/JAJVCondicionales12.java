package es.iesjandula.juan_alberto_jurado_valdivia.transparencia28;

import java.util.Scanner;

public class JAJVCondicionales12 {

	public static void main(String[] args) {
		
		int nota1,nota2,media;
		String recu;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce la primera nota: ");
		nota1=sc.nextInt();
		
		System.out.println("Introduce la segunda nota: ");
		nota2=sc.nextInt();
		
		media=(nota1+nota2)/2;
		
		if(media<5) {
			
			System.out.println("¿ Cual ha sido tu nota de recuperacion ? (apto/no apto)");
			recu=sc.next();
			
			if("apto".equals(recu)) {
				
				System.out.println("Tu nota de programacion es 5");
				
			}else {
				
				System.out.println("Tu nota de programacion es "+media);
				
			}
			
		}else {
			
			System.out.println("Tu nota de programacion es: "+ media);
			
		}

	}

}
