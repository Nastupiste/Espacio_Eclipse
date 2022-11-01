import javax.swing.JOptionPane;

/* Pedir una contraseña, y sólo dejar continuar cuando sea “osama” */

public class E_07 {

	public static void main(String[] args) {
		
		String passWord = "osama";
		String intento = JOptionPane.showInputDialog("Introduce una Contraseña:");
		
		while (true)
		{
			
			if (passWord.equals(intento))
			{
				JOptionPane.showMessageDialog(null, "¡¡ENHORABUENA!!\nContraseña correcta.");
				break;
			}
			
			else
			{
				intento= JOptionPane.showInputDialog("¡¡ERROR!!\n - Introduce una Contraseña:");
			}
		}
		
	}

}
