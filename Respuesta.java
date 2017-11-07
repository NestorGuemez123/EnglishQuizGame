
import javax.swing.JLabel;

public class Respuesta
{
	boolean esCorrecto;
	String resp;

	public Respuesta(boolean bandera, String resp)
	{
		esCorrecto = bandera;
		this.resp = resp;
	}
}