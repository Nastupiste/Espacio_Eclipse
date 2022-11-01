import javax.swing.JOptionPane;

public class E_04_Modified {

	public static void main(String[] args) {
	
		int numSecreto;
		int contador=1;
		numSecreto= (int)(Math.random()*100)+1;
		
		int intento=Integer.parseInt(JOptionPane.showInputDialog("Intenta adivinar el número secreto...\n - Serás capaz??? Muajajajajaja"));

		while (numSecreto!=intento&&contador<5)
		{
			if (intento>numSecreto)
			{
				JOptionPane.showMessageDialog(null, "¡TE PASASTE!\n Prueba con un número MENOR...");
			}
			else 
			{ 
				JOptionPane.showMessageDialog(null, "¡TE QUEDASTE CORTO!\n Prueba con un número MAYOR...");
			}
			intento=Integer.parseInt(JOptionPane.showInputDialog("Introduce otro intento."));
			contador++;
		}
		
		if (contador<=5)
			{
			JOptionPane.showMessageDialog(null, "¡¡¡¡DERROTA!!!!");
			}
		else
			JOptionPane.showMessageDialog(null, "¡¡¡¡ VICTORIA !!!!\n Lo has conseguido en: "+contador+" intentos.");
	}
}
