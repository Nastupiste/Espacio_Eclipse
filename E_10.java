import javax.swing.JOptionPane;

/*Pedir números hasta que se introduzca un 0, y mostrar su suma*/

public class E_10 {

	public static void main(String[] args) {

		int a=Integer.parseInt(JOptionPane.showInputDialog("REGLAS:\n1. Introduce todos los números que quieras sumar.\n2. Cuando introduzcas el 0 mostraré la Suma Total."));
		int sumaTotal=0;
		int contador=1;
		while (a!=0) 
		{
			sumaTotal=sumaTotal+a;
			contador++;
			a=Integer.parseInt(JOptionPane.showInputDialog("Introducción Nº "+contador+": "));	
		}
		JOptionPane.showMessageDialog(null, "La suma de los números es: "+sumaTotal);
	}
}
