import javax.swing.JOptionPane;

/*Pedir números enteros al usuario, hasta que se introduzca uno negativo, y para
cada uno mostrar su cuadrado.*/

public class E_01 {

	public static void main(String[] args) {
		
		int a=Integer.parseInt(JOptionPane.showInputDialog("REGLAS\n 1. Un numero entero positivo:\n - Obtienes el cuadrado\n 2. Si es negativo:\n - Goodbye!"));
		
		while(a>0)
			{
			int cuadrado=a*a;
			JOptionPane.showMessageDialog(null, cuadrado);
			a=Integer.parseInt(JOptionPane.showInputDialog("REGLAS\n 1. Un numero entero positivo:\n - Obtienes el cuadrado\n 2. Si es negativo:\n - Goodbye!"));		
			}
	}

}
