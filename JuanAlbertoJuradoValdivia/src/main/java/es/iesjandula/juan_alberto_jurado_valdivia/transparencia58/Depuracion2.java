package es.iesjandula.juan_alberto_jurado_valdivia.transparencia58;

public class Depuracion2 {
	
	private static String code1 = ":@A=", code2 = ">;?<", code3 = "BC:@";	

	public static void main(String[] args)	{
		
		System.out.println();

	}
	
	public static void decrypter(String code) {
		
		for(int i=0;i<code.length();i++) {
			
			char charDescrypted =(char) (code.charAt(i)-10);
			System.out.println(charDescrypted );  
			
		}
	}

}
