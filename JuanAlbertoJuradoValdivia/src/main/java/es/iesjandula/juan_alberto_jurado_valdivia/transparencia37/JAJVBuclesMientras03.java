package es.iesjandula.juan_alberto_jurado_valdivia.transparencia37;

import java.util.Scanner;

public class JAJVBuclesMientras03 {

	public static void main(String[] args) {
		
		int x,z,suma,resta,mult,div,resto;
		double potencia,raiz1,raiz2;
		
		Scanner sc=new Scanner(System.in);

			
		System.out.println("Introduce un numero: ");
		x=sc.nextInt();
		
		System.out.println("Introduce otro numero: ");
		z=sc.nextInt();
		
		while(z!=0) {
		
			suma=x+z;
			
			if(z>x) {
				
				resta=z-x;
			
			}else {
				
				resta=x-z;
			
			}
			
			mult=x*z;
			
			if(z>x) {
				
				div=z/x;
				resto=z%x;
			
			}else {
				
				div=x/z;
				resto=x%z;
			
			}
			
			potencia=Math.pow(x, z);
			
			raiz1=Math.sqrt(x);
			
			raiz2=Math.sqrt(z);
		
			System.out.println("\n *************************");
			System.out.println("\n      Calculadora 3.0     ");
			System.out.println("\n *************************");
			
			System.out.println("\n Suma: "+ suma
							+"\n Resta: "+ resta
							+"\n Multiplicacion: "+ mult
							+"\n Division: "+ div
							+"\n Resto: "+ resto
							+"\n Potencia "+ potencia
							+"\n Raiz de "+ x + "=" + raiz1
							+"\n Raiz de "+ z + "=" + raiz2);
		
		}

	}

}
