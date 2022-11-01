import javax.swing.JOptionPane;

public class pruebaExamen_06_Amazon {

	public static void main(String[] args) {
		
		String email="";
		char premium=' ';
		
		email = JOptionPane.showInputDialog("Introduzca un email: ");
		
		while (!email.equals("fin"));
		{
			premium = JOptionPane.showInputDialog("¿Es cliente premium?: ").toUpperCase().charAt(0);
			
		}

	}

}
