import javax.swing.JOptionPane;

/*Leer números enteros hasta que se introduzca uno negativo, y mostrar cuántos se han introducido.*/

public class E_03 {

	public static void main(String[] args) {
	
	int a=Integer.parseInt(JOptionPane.showInputDialog("REGLAS\n 1. Un numero entero positivo:\n - Obtienes el cuadrado\n 2. Si es negativo:\n - Goodbye!"));
	int contador=0;
	
		while(a>0)
			{
			int cuadrado=a*a;
			JOptionPane.showMessageDialog(null, cuadrado);
			a=Integer.parseInt(JOptionPane.showInputDialog("REGLAS\n 1. Un numero entero positivo:\n - Obtienes el cuadrado\n 2. Si es negativo:\n - Goodbye!"));		
			contador++;
			}
		JOptionPane.showMessageDialog(null, "Has introducido "+contador+" números positivos.");
	}

}
