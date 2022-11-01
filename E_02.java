import javax.swing.JOptionPane;

/*Leer números enteros hasta que se introduzca un 0, y para cada uno mostrar un 
mensaje diciendo si es positivo o negativo.*/

public class E_02 {

	public static void main(String[] args) {
	
	double a = Double.parseDouble(JOptionPane.showInputDialog("REGLAS\n 1. Introduce un numero:\n - Observo si es Positivo/Negativo\n 2. Si es el 0:\n - Goodbye!"));	
		
	while (a!=0)
	{
		if(a>0)
		{
			JOptionPane.showMessageDialog(null, "Es un número positivo!");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Es un número negativo!");
		}
		a=Integer.parseInt(JOptionPane.showInputDialog("REGLAS\n 1. Introduce un numero:\n - Observo si es Positivo/Negativo\n 2. Si es el 0:\n - Goodbye!"));
	}
		

	}

}
