package es.iesjandula.juan_alberto_jurado_valdivia.transparencia26;

import java.util.Scanner;

public class JAJVCondicionales05 {

	public static void main(String[] args) {
		
		int horas,minutos,result1,result2;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println( "Introduce la hora: ");
		horas=sc.nextInt();
		
		System.out.println( "Introduce los minutos: ");
		minutos=sc.nextInt();

		if(horas>=0 && horas<24 && minutos>=0 && minutos<60 ){
			
			result1=24-horas;
			result2=60-minutos;
			
			System.out.println("Quedan "+ result1 + " horas "+ " y " + result2 +" minutos ");
			
			
		}else{
			
			System.out.println( "Fuera de rango");
			
		}
		
	}

}
