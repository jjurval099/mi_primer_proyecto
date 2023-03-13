package es.iesjandula.juan_alberto_jurado_valdivia.transparencia10;

import java.util.Scanner;

public class JAJVPrimerosPasosPseInt11 {

	public static void main(String[] args) {
		
		double primerExamen,segundoExamen,nota;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce la nota del primer examen: ");
		primerExamen=sc.nextDouble();
		
		System.out.println("Cual es la nota que quieres sacar: ");
		nota=sc.nextDouble();
		
		double result=(nota-primerExamen*0.4)/0.6;
		
		System.out.println("Para tener un "+ nota +" en el trimestre necesitas sacar un "+ result +" en el segundo examen." );

	}

}
