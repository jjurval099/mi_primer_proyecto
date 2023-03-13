package es.iesjandula.juan_alberto_jurado_valdivia.transparencia27;

import java.util.Scanner;

public class JAJVCondicionales11 {

	public static void main(String[] args) {
		
		int n, aux, inverso = 0, cifra;
		
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");                                                 
        n = sc.nextInt();
        
        aux = n;
        while (aux!=0){
            cifra = aux % 10;
            inverso = inverso * 10 + cifra;
            aux = aux / 10;
        }
    
        if(n == inverso){
            System.out.println("Es capicua");
        }else{
            System.out.println("No es capicua");
        }
    }
}