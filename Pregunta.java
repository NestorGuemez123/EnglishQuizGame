
public class Pregunta
{
	String textoPregunta1;
	String textoPregunta2;
	String textoPregunta3;
	Respuesta [] respuestas;
	
	public Pregunta()
	{
		
	}
	
	public Pregunta(String cadena1, String cadena2, String cadena3, int numRespuestas)
	{
		textoPregunta1 = cadena1;
		textoPregunta2 = cadena2;
		textoPregunta3 = cadena3; 
		respuestas = new Respuesta[numRespuestas];
	}
	
}