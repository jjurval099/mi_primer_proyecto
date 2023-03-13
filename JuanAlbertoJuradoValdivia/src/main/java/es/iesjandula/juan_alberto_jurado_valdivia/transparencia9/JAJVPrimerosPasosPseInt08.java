package es.iesjandula.juan_alberto_jurado_valdivia.transparencia9;

import java.util.Scanner;

public class JAJVPrimerosPasosPseInt08 {

	public static void main(String[] args) {
		

		int num1,num2,suma,resta,mult,div,resto;
		double potencia,raiz;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		num1=sc.nextInt();
		
		System.out.println("Introduce otro numero: ");
		num2=sc.nextInt();
		
		suma=num1+num2;
		
		if(num2>num1) {
			
			resta=num2-num1;
		
		}else {
			
			resta=num1-num2;
		
		}
		
		mult=num1*num2;
		
		if(num2>num1) {
			
			div=num2/num1;
			resto=num2%num1;
		
		}else {
			
			div=num1/num2;
			resto=num1%num2;
		
		}
		
		potencia=Math.pow(num1, num2);
		
		raiz=Math.sqrt(num1)+Math.sqrt(num2);
		
		System.out.println("\n *************************");
		System.out.println("\n      Calculadora 2.0     ");
		System.out.println("\n *************************");
		
		System.out.println("\n Suma: "+ suma
						+"\n Resta: "+ resta
						+"\n Multiplicacion: "+ mult
						+"\n Division: "+ div
						+"\n Resto: "+ resto
						+"\n Potencia "+ potencia
						+"\n Raiz "+ raiz);
		

	}

}
