import javax.swing.JOptionPane;
/*Pedir un número entero N, y mostrar su factorial.*/
public class E_12 {
	public static void main(String[] args) {		
		double factorial=1;
		//pido un valor al usuario
		int a = Integer.parseInt(JOptionPane.showInputDialog("Introduce un Numero y calcularé su factorial: "));
		while (a>0) 
		{
			factorial=factorial*a;
			a--;
			System.out.println(a);
		}
		JOptionPane.showMessageDialog(null,"El numero factorial es:\n "+factorial);
	}
}
