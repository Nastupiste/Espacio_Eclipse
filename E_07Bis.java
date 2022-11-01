import javax.swing.JOptionPane;

/*Buscar solución*/

public class E_07Bis {

	public static void main(String[] args) {
		
		
		String passWord = "osama";
		String intento;
		
		do 
		{
		
		intento=JOptionPane.showInputDialog("Introduzca una contraseña: ");	
			
		}
		while(!intento.equals(passWord));
		
		
	}

}
