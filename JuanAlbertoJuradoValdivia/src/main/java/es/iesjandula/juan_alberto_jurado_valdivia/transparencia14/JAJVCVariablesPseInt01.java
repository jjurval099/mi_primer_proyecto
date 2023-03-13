package es.iesjandula.juan_alberto_jurado_valdivia.transparencia14;

public class JAJVCVariablesPseInt01 {

	public static void main(String[] args) {
		
		double x=144,y=999;
		double suma,resta,mult,div;
		String nombre="Juan Alberto Jurado Valdivia";
		
		suma=x+y;
		
		if(x>y) {
			
			resta=x-y;
		
		}else {
			
			resta=y-x;
		
		}
		
		mult=x*y;
		
		if(y>x) {
			
			div=y/x;
		
		}else {
			
			div=x/y;
		
		}
		
		System.out.println("Suma: "+ suma);
		System.out.println("Resta: "+ resta);
		System.out.println("Multiplicacion: "+ mult);
		System.out.println("Division: "+ div);
		
		System.out.println("\nNombre completo: "+nombre);

	}

}
