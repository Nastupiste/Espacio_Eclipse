import javax.swing.JOptionPane;

/*Pedir 15 números y mostrar la suma total.*/

public class E_08 {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Introduce 15 números.\nMostraré la suma total:");

		int a;
		int contador=1;
		int sumaTotal=0;

		for(int i=0;i<15;i++)	
		{
			a = Integer.parseInt(JOptionPane.showInputDialog("Numero "+contador+": "));
			sumaTotal=sumaTotal+a;
			contador++;
		}
		JOptionPane.showMessageDialog(null, "La suma total es: "+sumaTotal);
	}
}
