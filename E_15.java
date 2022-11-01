import javax.swing.JOptionPane;

/*Pedir 50 sueldos, y mostrar su suma, y cuántos hay mayores de 1500.*/

public class E_15 {

	public static void main(String[] args) {
		int sueldo=0;
		int sueldoTotal=0;
		int contador=0;
		
		for(int i=0;i<5;i++) 
		{
			sueldo=Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce tu sueldo: "));
			sueldoTotal+=sueldo;
			
			if (sueldo>1500)
			{
				contador++;
			}
		}
		JOptionPane.showMessageDialog(null, "La suma de los sueldos es: "+sueldoTotal+"€\n"
				+ "Nº Sueldos mayores que 1500€: "+contador);
	}
}
