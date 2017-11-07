/*

Controlador();
Round(String nom, int puntos, int numPreguntas);
Pregunta(String cadena1, String cadena2, String cadena3, numRespuestas);
Respuesta(boolean bandera, String resp);

*/



public class Controlador
{
	Round[] todosLosRound;

	public Controlador()
	{
		todosLosRound = new Round[1];
		todosLosRound[0] = new Round("1", 5, 5);
		todosLosRound[0].preguntas[0] = new Pregunta("Where is james", "", "?", 3);
		todosLosRound[0].preguntas[0].respuestas[0] = new Respuesta(false, "go");
		todosLosRound[0].preguntas[0].respuestas[1] = new Respuesta(false, "went");
		todosLosRound[0].preguntas[0].respuestas[2] = new Respuesta(true, "going");

		todosLosRound[0].preguntas[1] = new Pregunta("He", "", "table tennis at home", 3);
		todosLosRound[0].preguntas[1].respuestas[0] = new Respuesta(false, "play");
		todosLosRound[0].preguntas[1].respuestas[1] = new Respuesta(true, "plays");
		todosLosRound[0].preguntas[1].respuestas[2] = new Respuesta(false, "playing");

		todosLosRound[0].preguntas[2] = new Pregunta("I", "", "a big green ballon", 3);
		todosLosRound[0].preguntas[2].respuestas[0] = new Respuesta(false, "wanting");
		todosLosRound[0].preguntas[2].respuestas[1] = new Respuesta(false, "wants");
		todosLosRound[0].preguntas[2].respuestas[2] = new Respuesta(true, "want");

		todosLosRound[0].preguntas[3] = new Pregunta("Jacob brother is", "", "later today", 3);
		todosLosRound[0].preguntas[3].respuestas[0] = new Respuesta(false, "comes");
		todosLosRound[0].preguntas[3].respuestas[1] = new Respuesta(true, "coming");
		todosLosRound[0].preguntas[3].respuestas[2] = new Respuesta(false, "come");

		todosLosRound[0].preguntas[4] = new Pregunta("Tom and i are", "", "to paint the house", 3);
		todosLosRound[0].preguntas[4].respuestas[0] = new Respuesta(false, "go");
		todosLosRound[0].preguntas[4].respuestas[1] = new Respuesta(false, "goes");
		todosLosRound[0].preguntas[4].respuestas[2] = new Respuesta(true, "going");

	}
	public Round obtenerRoundActual()
	{	
		return todosLosRound[0];
	}
}