import javax.swing.JOptionPane;

/*Pedir 30 números, y después de introducidos, indicar si se introdujo alguno negativo*/

public class E_19_bis {

	public static final int NUM_VALORES=3;

	public static void main(String[] args) 
	{
		float n;
		boolean hayNegativos=false;

		for (int i=0; i<NUM_VALORES;i++) 
		{
			n=Float.parseFloat(JOptionPane.showInputDialog("Numero: "));
			if (n<0) 
			{
				hayNegativos=true;
			}
		}
		if (hayNegativos)
			JOptionPane.showMessageDialog(null, "Hay algún valor negativo");
		else
			JOptionPane.showMessageDialog(null, "no hay ningún valor negativo");
	}
}
