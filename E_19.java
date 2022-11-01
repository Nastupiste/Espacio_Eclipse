import javax.swing.JOptionPane;

/* Pedir 30 números, y después de introducidos, indicar si se introdujo alguno negativo*/

public class E_19 {

	public static void main(String[] args) {
	
		int n=0,contador=0;
		for(int i=0;i<30;i++)
		{
			n=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número: "));
			if (n<0)
			{
				contador++;
			}
		}
		JOptionPane.showMessageDialog(null, "Hay "+contador+" números negativos.");
	}
}