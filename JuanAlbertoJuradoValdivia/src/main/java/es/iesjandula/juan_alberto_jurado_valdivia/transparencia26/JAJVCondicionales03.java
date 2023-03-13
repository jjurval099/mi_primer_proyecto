package es.iesjandula.juan_alberto_jurado_valdivia.transparencia26;

import java.util.Scanner;

public class JAJVCondicionales03 {

	public static void main(String[] args) {
		
		int dia;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce un dia: ");
		dia=sc.nextInt();
		
		if(dia>=1 && dia<=7) {
			
			if(dia==1) {
				
				System.out.println("Hoy es lunes");
				
			}else if(dia==2){
				
				System.out.println("Hoy es martes");
				
			}else if(dia==3){
				
				System.out.println("Hoy es miercoles");
				
			}else if(dia==4){
				
				System.out.println("Hoy es jueves");
				
			}else if(dia==5){
				
				System.out.println("Hoy es viernes");
				
			}else if(dia==6){
				
				System.out.println("Hoy es sabado");
				
			}else{
				
				System.out.println("Hoy es domingo");	
				
			}
		}else {
			
			System.out.println("Fuera de rango");
		}

	}

}
