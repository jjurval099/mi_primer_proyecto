package es.iesjandula.juan_alberto_jurado_valdivia.transparencia58;

public class Depuracion1 {

	public static void main(String[] args) 	
	{		
		String usuario="ninguno";
		String password="ninguna";
		
		boolean accesoSistema=false;
		
		if(usuario.equals("usuarioSecreto") && password.equals("contraseñaSecreta")) 
		{			
			accesoSistema=true;
			System.out.println("Acceso al sistema realizado");
			
		}
		else 
		{
			System.out.println("Aviso al personal de vigilancia");
		}
		
		boolean accesoAlNumeroSecreto=false;
		
		if(accesoSistema)
		{
			int numeroSecreto=20;
			
			if(numeroSecreto==20) 
			{
				accesoAlNumeroSecreto=true;
				
			}
		}
		
	}
	
	public static void aperturaDeCompuerta() 
	{
		System.out.println("Apertura de compuerta realizada");	
	}

}
