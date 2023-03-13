package es.iesjandula.juan_alberto_jurado_valdivia.transparencia14;

public class JAJVCVariablesPseInt03 {

	public static void main(String[] args) {
		
		double precioSin=24,precioCon,factura;
		final double IVA=0.12;
		
		factura=precioSin*IVA;
		precioCon=precioSin+IVA;
		
		System.out.println("Precio con IVA "+ precioSin +" Precio con IVA "+ precioCon);

	}

}
