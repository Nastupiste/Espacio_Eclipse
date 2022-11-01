import javax.swing.JOptionPane;

/*Pedir un número N que otro usuario deberá adivinar, y después ir pidiendo 
números indicando “mayor” o “menor” hasta que el segundo usuario lo adivine.*/

public class E_04 {

	public static void main(String[] args) {
		
		int numSecreto=Integer.parseInt(JOptionPane.showInputDialog("Usuario_1: Introduce un número secreto!!\n - El usuario_2 NO DEBE conocerlo!"));
		int intento=Integer.parseInt(JOptionPane.showInputDialog("Usuario_2: Intenta adivinar el número secreto...\n - Serás capaz??? Muajajajajaja"));
		int contador=1;
		while (numSecreto!=intento)
		{
			if (intento>numSecreto)
			{
				JOptionPane.showMessageDialog(null, "¡TE PASASTE!\n Prueba con un número MENOR...");
			}
			else 
			{ 
				JOptionPane.showMessageDialog(null, "¡TE QUEDASTE CORTO!\n Prueba con un número MAYOR...");
			}
			intento=Integer.parseInt(JOptionPane.showInputDialog("Usuario_2: introduce otro intento."));
			contador++;
		}
		JOptionPane.showMessageDialog(null, "¡¡¡¡ VICTORIA !!!!\\n Lo has conseguido en: "+contador+" intentos.");
	}	
}
