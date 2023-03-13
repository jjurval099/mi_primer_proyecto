package es.iesjandula.juan_alberto_jurado_valdivia.transparencia26;

import java.util.Scanner;

public class JAJVCondicionales02 {

	public static void main(String[] args) {
		
		int hora;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce una hora: ");
		
		hora=sc.nextInt();
		
		if(hora>0 && hora<24) {
			
			if(hora>=6 && hora<=12) {
				
				System.out.println("Buenos dias");
				
			}else if(hora>=13 && hora<=20){
				
				System.out.println("Buenas tardes");
				
			}else{
				
				System.out.println("Buenas noches");			
				
			}
		}else {
			
			System.out.println("Fuera de rango");
		}
		
		sc.close();
		

	}

}
