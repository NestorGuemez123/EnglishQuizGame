public class Round
{
	String nombre;
	int puntosSumadosPorRespuestaCorrecta;
	Pregunta [] preguntas;
	
	public Round(String nom, int puntos, int numPreguntas)
	{
		nombre = nom;
		puntosSumadosPorRespuestaCorrecta = puntos;
		preguntas = new Pregunta[numPreguntas];
	}
}