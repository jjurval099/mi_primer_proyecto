package es.iesjandula.juan_alberto_jurado_valdivia.transparencia45;

import java.util.Scanner;

public class JAJVBuclesHacerHastaQue05 {

	public static void main(String[] args) {
		
		int altura;
		
		Scanner sc=new Scanner(System.in);
		
		do {
			
			System.out.println("Introduce la altura: ");
			altura=sc.nextInt();
				
		}while(altura<0);
		
		 for(int numAsterisco=1;numAsterisco<=altura;numAsterisco++){
			 
	            for(int i=0;i<numAsterisco;i++){
	            	
	                System.out.print("*");
	                
	            }
	            
            System.out.println("");
	 	}
	}
}